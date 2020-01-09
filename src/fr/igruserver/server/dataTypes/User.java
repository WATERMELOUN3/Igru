package fr.igruserver.server.dataTypes;

import fr.igruserver.server.IMessageReceived;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.sql.Date;

public class User implements Runnable {
    private SocketChannel _channel;
    private String _name;

    private IMessageReceived _messageReceivedEvent = null;

    private boolean _running = true;

    public User(SocketChannel channel, String name) {
        _channel = channel;
        _name = name;
    }

    public User(SocketChannel channel, String name, IMessageReceived messageReceivedEvent) {
        _channel = channel;
        _name = name;
        _messageReceivedEvent = messageReceivedEvent;
    }

    @Override
    public void run() {
        while (_running) {
            ByteBuffer buffer = ByteBuffer.allocate(256);
            int size = 256;
            do {
                try {
                    size = _channel.read(buffer);
                    if (size == 256)
                        buffer.limit(buffer.limit() + 256);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } while (size == 256);

            buffer.rewind();
            if (_messageReceivedEvent != null)
                _messageReceivedEvent.MessageReceived(this, buffer);
        }
    }

    public void close() {
        _running = false;

        try {
            _channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void BuildSyncPacket(ByteBuffer buffer) {
        byte[] strBytes = new byte[10];
        buffer.get(strBytes);
        Date date = Date.valueOf(new String(strBytes, StandardCharsets.UTF_8));

        // Do sql request

    }

    public SocketChannel GetChannel() {
        return _channel;
    }

    public String GetName() {
        return _name;
    }
}
