package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInEntityNBTQuery extends WrappedPacket<WrappedPlayInEntityNBTQuery> {

    public WrappedPlayInEntityNBTQuery(Object rawPacket, PacketContainer<WrappedPlayInEntityNBTQuery> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
