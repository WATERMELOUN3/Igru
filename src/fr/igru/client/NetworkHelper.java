package fr.igru.client;

import javax.net.ssl.*;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkHelper {
    private SSLSocket _socket;
    private String _ip;
    private int _port;
    private DataOutputStream _streamWriter;
    private DataInputStream _streamReader;

    public NetworkHelper(String ip, int port) {
        this._ip = ip;
        this._port = port;
    }

    public void initialize() {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            _socket = (SSLSocket) factory.createSocket(_ip, _port);
            _socket.startHandshake();
            _streamWriter = new DataOutputStream(_socket.getOutputStream());
            _streamReader = new DataInputStream(_socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            _streamReader.close();
            _streamWriter.close();
            _socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] readMessage() {
        return readMessage(256);
    }

    public byte[] readMessage(int bufferSize) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[bufferSize];
        int bytes = bufferSize;
        do {
            try {
                bytes = _streamReader.read(buffer, 0, bufferSize);
                output.write(buffer, 0, bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (bytes == bufferSize);

        return output.toByteArray();
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
}
