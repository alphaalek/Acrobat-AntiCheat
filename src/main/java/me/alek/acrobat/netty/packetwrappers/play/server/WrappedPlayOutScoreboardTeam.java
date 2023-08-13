package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutScoreboardTeam extends WrappedPacket<WrappedPlayOutScoreboardTeam> {

    public WrappedPlayOutScoreboardTeam(Object rawPacket, PacketContainer<WrappedPlayOutScoreboardTeam> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
