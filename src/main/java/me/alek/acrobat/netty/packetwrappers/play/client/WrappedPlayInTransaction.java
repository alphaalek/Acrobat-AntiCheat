package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInTransaction extends WrappedPacket<WrappedPlayInTransaction> {

    public WrappedPlayInTransaction(Object rawPacket, PacketContainer<WrappedPlayInTransaction> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
