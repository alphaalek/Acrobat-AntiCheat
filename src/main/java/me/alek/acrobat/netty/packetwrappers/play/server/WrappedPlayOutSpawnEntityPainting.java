package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutSpawnEntityPainting extends WrappedPacket<WrappedPlayOutSpawnEntityPainting> {

    public WrappedPlayOutSpawnEntityPainting(Object rawPacket, PacketContainer<WrappedPlayOutSpawnEntityPainting> packetContainer) {
        super(rawPacket, packetContainer);
    }
}