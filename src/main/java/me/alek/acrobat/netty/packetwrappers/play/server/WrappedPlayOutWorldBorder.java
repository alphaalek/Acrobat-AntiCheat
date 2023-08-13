package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutWorldBorder extends WrappedPacket<WrappedPlayOutWorldBorder> {

    public WrappedPlayOutWorldBorder(Object rawPacket, PacketContainer<WrappedPlayOutWorldBorder> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
