package me.alek.honey.netty.packetwrappers.play.server;

import me.alek.honey.netty.api.packet.container.PacketContainer;
import me.alek.honey.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutViewDistance extends WrappedPacket<WrappedPlayOutViewDistance> {

    public WrappedPlayOutViewDistance(Object rawPacket, PacketContainer<WrappedPlayOutViewDistance> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
