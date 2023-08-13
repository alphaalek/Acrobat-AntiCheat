package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutRelEntityMove extends WrappedPacket<WrappedPlayOutRelEntityMove> {

    public WrappedPlayOutRelEntityMove(Object rawPacket, PacketContainer<WrappedPlayOutRelEntityMove> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
