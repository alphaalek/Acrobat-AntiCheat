package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInDifficultyLock extends WrappedPacket<WrappedPlayInDifficultyLock> {

    public WrappedPlayInDifficultyLock(Object rawPacket, PacketContainer<WrappedPlayInDifficultyLock> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
