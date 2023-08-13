package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutWorldParticles extends WrappedPacket<WrappedPlayOutWorldParticles> {

    public WrappedPlayOutWorldParticles(Object rawPacket, PacketContainer<WrappedPlayOutWorldParticles> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
