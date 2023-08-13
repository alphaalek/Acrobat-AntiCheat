package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutCollect extends WrappedPacket<WrappedPlayOutCollect> {

    public WrappedPlayOutCollect(Object rawPacket, PacketContainer<WrappedPlayOutCollect> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
