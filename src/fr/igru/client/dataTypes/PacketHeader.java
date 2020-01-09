package fr.igru.client.dataTypes;

public enum PacketHeader {
    Ping((byte)0),
    Pong((byte)1),
    Auth((byte)2),
    AuthAnswer((byte)3),
    GetSync((byte)4),
    Sync((byte)5),
    SyncMsg((byte)6),
    SyncFil((byte)7),
    SyncAck((byte)8)
    ;

    private final byte point;

    private PacketHeader(byte point)
    {
        this.point = point;
    }

    public byte getValue() {
        return point;
    }
}
