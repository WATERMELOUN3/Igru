package fr.igruserver.server;

import fr.igru.client.dataTypes.PacketHeader;
import fr.igruserver.server.dataTypes.ServerUser;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Server implements Runnable, IMessageReceived{
    private ServerSocketChannel _socket;
    private int _port;
    private ArrayList<ServerUser> _users;
    private SQLHelper _sql;

    public Server(int port) {
        this._port = port;
        _users = new ArrayList<ServerUser>();

        try {
            _socket = ServerSocketChannel.open();
            _socket.bind(new InetSocketAddress(port));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Authenticate(SocketChannel client) {
        ByteBuffer buffer = ByteBuffer.allocate(64);
        try {
            int length = client.read(buffer);
            buffer.rewind();
            if (length > 1 && buffer.get() == PacketHeader.Auth.getValue()) {
                // Log ?
                int usrLen = buffer.getInt();
                byte[] usrBytes = new byte[usrLen];
                buffer.get(usrBytes);

                String usrname = new String(usrBytes, StandardCharsets.UTF_8);
                usrBytes = new byte[32];
                buffer.get(usrBytes);

                byte answer = 0;
                if (CheckCredentials(usrname, usrBytes)) {
                    _users.add(new ServerUser(client, usrname, this));
                    answer = 1;
                }

                buffer = ByteBuffer.allocate(2);
                buffer.put(PacketHeader.AuthAnswer.getValue());
                buffer.put(answer);
                client.write(buffer);

                if (answer == 0)
                    client.close();
                else {
                    Thread uThd = new Thread(_users.get(_users.size() - 1));
                    uThd.start();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean CheckCredentials(String username, byte[] password) {
        return true;
    }

    // Runnable interface
    @Override
    public void run() {
        _sql = new SQLHelper("admin", "admin");
        new Thread(new Runnable() {
            public void run() {
                while (_socket.isOpen()) {
                    try {
                        SocketChannel client = _socket.accept();
                        Authenticate(client);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    public void MessageReceived(ServerUser user, ByteBuffer message) {
        ByteBuffer buf;
        byte header = message.get();
        try {
            switch (header) {
                case 0: // Ping
                    buf = ByteBuffer.allocate(1);
                    buf.put((byte) 1);
                    user.GetChannel().write(buf);
                    break;

                case 4: // GetSync
                    buf = ByteBuffer.allocate(1024);
                    user.BuildSyncPacket(buf, _sql);

                default:
                    user.close();
                    _users.remove(user);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
