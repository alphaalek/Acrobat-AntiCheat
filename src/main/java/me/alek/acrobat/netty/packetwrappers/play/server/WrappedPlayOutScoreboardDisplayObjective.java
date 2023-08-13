package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutScoreboardDisplayObjective extends WrappedPacket<WrappedPlayOutScoreboardDisplayObjective> {

    public WrappedPlayOutScoreboardDisplayObjective(Object rawPacket, PacketContainer<WrappedPlayOutScoreboardDisplayObjective> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
