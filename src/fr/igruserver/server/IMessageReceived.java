package fr.igruserver.server;

import fr.igruserver.server.dataTypes.ServerUser;

import java.nio.ByteBuffer;

public interface IMessageReceived {
    public void MessageReceived(ServerUser user, ByteBuffer message);
}
