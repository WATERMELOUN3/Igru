package fr.igru.client;

import fr.igru.client.dataTypes.PacketHeader;

import javax.net.ssl.*;
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkHelper implements Runnable {
    private SocketChannel _socket;
    private String _ip;
    private int _port;

    private boolean _running = true;

    public NetworkHelper(String ip, int port) {
        this._ip = ip;
        this._port = port;

        try {
            _socket = SocketChannel.open(new InetSocketAddress(_ip, _port));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            _running = false;
            _socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void messageReceived(ByteBuffer buffer) {
        byte header = buffer.get();
        switch (header) {
            case 0: // Ping
                break;

            case 6: // SyncMsg
                break;

            case 7: // SyncFil
                break;

            default:
                System.exit(99);
        }
    }

    public ByteBuffer readMessage() {
        return readMessage(256);
    }

    public ByteBuffer readMessage(int bufferSize) {
        ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
        int size = bufferSize;
        do {
            try {
                size = _socket.read(buffer);
                if (size == bufferSize)
                    buffer.limit(buffer.limit() + bufferSize);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (size == bufferSize);

        buffer.rewind();
        return buffer;
    }

    public static String getSHA256(String input) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            return bytesToHex(digest.digest(input.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    @Override
    public void run() {
        while (_running) {
            ByteBuffer buffer = readMessage();

            buffer.rewind();
            messageReceived(buffer);
        }
    }
}
