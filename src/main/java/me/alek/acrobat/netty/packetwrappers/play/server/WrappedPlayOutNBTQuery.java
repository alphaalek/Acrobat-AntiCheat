package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutNBTQuery extends WrappedPacket<WrappedPlayOutNBTQuery> {

    public WrappedPlayOutNBTQuery(Object rawPacket, PacketContainer<WrappedPlayOutNBTQuery> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
