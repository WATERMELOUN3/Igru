package fr.igru.client.dataTypes;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.util.ArrayList;

public class FilDiscussion {
    private int _id;
    private String _title;
    private Date _dateCreated;
    private MessageStatus _status;
    private ArrayList<Message> _messages;

    public FilDiscussion(String title, Date dateCreated) {
        _id = -1;
        _title = title;
        _dateCreated = dateCreated;
        _status = MessageStatus.Waiting;

        _messages = new ArrayList<>();
    }

    public FilDiscussion(int id, String title, Date dateCreated) {
        _id = id;
        _title = title;
        _dateCreated = dateCreated;
        _status = MessageStatus.Waiting;

        _messages = new ArrayList<>();
    }

    public FilDiscussion(int id, String title, Date dateCreated, MessageStatus status) {
        _id = id;
        _title = title;
        _dateCreated = dateCreated;
        _status = status;

        _messages = new ArrayList<>();
    }

    public void writeBytes(ByteBuffer buffer) {
        buffer.putInt(_id);
        buffer.put(_dateCreated.toString().getBytes(StandardCharsets.UTF_8));
        buffer.putInt(_title.length());
        buffer.put(_title.getBytes(StandardCharsets.UTF_8));
        buffer.putInt(_status.ordinal());
    }

    public static FilDiscussion valueOf(ByteBuffer buffer) {
        int id;
        Date dateCreated;
        String title;
        MessageStatus status;
        byte[] tBuffer;

        id = buffer.getInt();

        tBuffer = new byte[10];
        buffer.get(tBuffer);
        dateCreated = Date.valueOf(new String(tBuffer, StandardCharsets.UTF_8));

        int titleLen = buffer.getInt();
        tBuffer = new byte[titleLen];
        buffer.get(tBuffer);
        title = new String(tBuffer, StandardCharsets.UTF_8);

        status = MessageStatus.values()[buffer.getInt()];

        return new FilDiscussion(id, title, dateCreated, status);
    }

    public ArrayList<Message> getMessages() {
        return _messages;
    }
}
