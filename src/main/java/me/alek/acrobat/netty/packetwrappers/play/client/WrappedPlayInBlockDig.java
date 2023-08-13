package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.modelwrappers.WrappedBlockPosition;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInBlockDig extends WrappedPacket<WrappedPlayInBlockDig> {

    public WrappedPlayInBlockDig(Object rawPacket, PacketContainer<WrappedPlayInBlockDig> packetContainer) {
        super(rawPacket, packetContainer);
    }

    public WrappedBlockPosition getBlockPosition() {
        return getContainer().getBlockPositions().readField(0);
    }
}
