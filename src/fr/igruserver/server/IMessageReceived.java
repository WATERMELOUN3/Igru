package fr.igruserver.server;

import fr.igruserver.server.dataTypes.User;

import java.nio.ByteBuffer;

public interface IMessageReceived {
    public void MessageReceived(User user, ByteBuffer message);
}
