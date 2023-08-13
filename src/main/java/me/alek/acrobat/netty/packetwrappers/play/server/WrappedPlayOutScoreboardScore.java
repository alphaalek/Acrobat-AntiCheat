package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutScoreboardScore extends WrappedPacket<WrappedPlayOutScoreboardScore> {

    public WrappedPlayOutScoreboardScore(Object rawPacket, PacketContainer<WrappedPlayOutScoreboardScore> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
