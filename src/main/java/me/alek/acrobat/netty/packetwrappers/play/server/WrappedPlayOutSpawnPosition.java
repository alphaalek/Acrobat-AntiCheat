package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutSpawnPosition extends WrappedPacket<WrappedPlayOutSpawnPosition> {

    public WrappedPlayOutSpawnPosition(Object rawPacket, PacketContainer<WrappedPlayOutSpawnPosition> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
