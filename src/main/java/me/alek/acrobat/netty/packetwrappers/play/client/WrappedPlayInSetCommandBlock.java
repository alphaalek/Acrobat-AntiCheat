package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInSetCommandBlock extends WrappedPacket<WrappedPlayInSetCommandBlock> {

    public WrappedPlayInSetCommandBlock(Object rawPacket, PacketContainer<WrappedPlayInSetCommandBlock> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
