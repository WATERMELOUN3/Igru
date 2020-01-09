package fr.igruserver.server.dataTypes;

import fr.igru.client.dataTypes.FilDiscussion;
import fr.igru.client.dataTypes.Message;
import fr.igruserver.server.IMessageReceived;
import fr.igruserver.server.SQLHelper;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServerUser implements Runnable {
    private SocketChannel _channel;
    private String _username;

    private IMessageReceived _messageReceivedEvent = null;

    private boolean _running = true;

    public ServerUser(SocketChannel channel, String name) {
        _channel = channel;
        _username = name;
    }

    public ServerUser(SocketChannel channel, String name, IMessageReceived messageReceivedEvent) {
        _channel = channel;
        _username = name;
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

    public void BuildSyncPacket(ByteBuffer buffer, SQLHelper sql) {
        byte[] strBytes = new byte[10];
        buffer.get(strBytes);
        Date date = Date.valueOf(new String(strBytes, StandardCharsets.UTF_8));

        ArrayList<Message> messages = new ArrayList<>();
        ArrayList<FilDiscussion> fils = new ArrayList<>();
        // Do sql request
        // First we get the groups ids
        ArrayList<String> groups = getGroupsIds(sql);
        for (String s : groups) {
            Statement stmt = sql.createStatement();
            try {
                ResultSet rs = stmt.executeQuery("SELECT * FROM FilDeDiscussion WHERE FilDeDiscussion.dateCreat >= " + date +
                        " AND FilDeDiscussion.groupe == " + s);
                while (rs.next()) {
                    int id = rs.getInt("idFdD");
                    String title = rs.getString("titre");
                    Date dateCreated = rs.getDate("dateCreat");
                    FilDiscussion fd = new FilDiscussion(id, title, dateCreated);

                    ResultSet rs2 = stmt.executeQuery("SELECT * FROM message WHERE idFdD == " + id + " AND datePost >= " + date);
                    while (rs2.next()) {
                        id = rs2.getInt("idMsg");
                        title = rs2.getString("texte");
                        dateCreated = rs2.getDate("datePost");
                        int idAuthor = rs2.getInt("idUser");

                        fd.getMessages().add(new Message(id, dateCreated, title));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private ArrayList<String> getGroupsIds(SQLHelper sql) {
        ArrayList<String> ids = new ArrayList<>();
        Statement stmt = sql.createStatement();
        try {
            ResultSet rs = stmt.executeQuery("SELECT FROM groupe.nom WHERE groupe.idUser == utilisateur.idUser AND utilisateur.username == " + _username);
            while (rs.next()) {
                ids.add(rs.getString("nom"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ids;
    }

    public SocketChannel GetChannel() {
        return _channel;
    }

    public String GetName() {
        return _username;
    }
}
