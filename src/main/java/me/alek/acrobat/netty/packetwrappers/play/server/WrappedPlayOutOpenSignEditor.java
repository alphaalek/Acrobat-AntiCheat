package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutOpenSignEditor extends WrappedPacket<WrappedPlayOutOpenSignEditor> {

    public WrappedPlayOutOpenSignEditor(Object rawPacket, PacketContainer<WrappedPlayOutOpenSignEditor> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
