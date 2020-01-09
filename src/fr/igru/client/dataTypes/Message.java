package fr.igru.client.dataTypes;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.sql.Date;

public class Message {
    private int _id;
    private Date _date;
    private String _content;

    public Message(Date date, String content) {
        _id = -1;
        _date = date;
        _content = content;
    }

    public Message(int id, Date date, String content) {
        _id = id;
        _date = date;
        _content = content;
    }

    public void writeBytes(ByteBuffer buffer) {
        buffer.putInt(_id);
        buffer.put(_date.toString().getBytes(StandardCharsets.UTF_8));
        buffer.putInt(_content.length());
        buffer.put(_content.getBytes(StandardCharsets.UTF_8));
    }

    public static Message valueOf(ByteBuffer buffer) {
        int id = buffer.getInt();

        byte[] tBuffer = new byte[10];
        buffer.get(tBuffer);
        Date date = Date.valueOf(new String(tBuffer, StandardCharsets.UTF_8));

        int contentLen = buffer.getInt();
        tBuffer = new byte[contentLen];
        buffer.get(tBuffer);
        String content = new String(tBuffer, StandardCharsets.UTF_8);

        return new Message(id, date, content);
    }
}
