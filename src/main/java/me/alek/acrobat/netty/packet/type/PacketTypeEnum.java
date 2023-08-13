package me.alek.acrobat.netty.packet.type;

public interface PacketTypeEnum {

    Class<?> getNmsClass();

    byte getPacketId();

    PacketState getState();

    PacketBound getBound();

}
