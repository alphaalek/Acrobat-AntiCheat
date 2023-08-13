package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutServerDifficulty extends WrappedPacket<WrappedPlayOutServerDifficulty> {

    public WrappedPlayOutServerDifficulty(Object rawPacket, PacketContainer<WrappedPlayOutServerDifficulty> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
