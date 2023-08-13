package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutNamedEntitySpawn extends WrappedPacket<WrappedPlayOutNamedEntitySpawn> {

    public WrappedPlayOutNamedEntitySpawn(Object rawPacket, PacketContainer<WrappedPlayOutNamedEntitySpawn> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
