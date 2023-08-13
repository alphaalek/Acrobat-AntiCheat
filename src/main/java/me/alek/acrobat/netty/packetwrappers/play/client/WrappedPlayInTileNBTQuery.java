package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInTileNBTQuery extends WrappedPacket<WrappedPlayInTileNBTQuery> {

    public WrappedPlayInTileNBTQuery(Object rawPacket, PacketContainer<WrappedPlayInTileNBTQuery> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
