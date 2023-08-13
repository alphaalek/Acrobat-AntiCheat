package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutMultiBlockChange extends WrappedPacket<WrappedPlayOutMultiBlockChange> {

    public WrappedPlayOutMultiBlockChange(Object rawPacket, PacketContainer<WrappedPlayOutMultiBlockChange> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
