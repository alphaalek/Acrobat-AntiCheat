package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutSpawnEntityLiving extends WrappedPacket<WrappedPlayOutSpawnEntityLiving> {

    public WrappedPlayOutSpawnEntityLiving(Object rawPacket, PacketContainer<WrappedPlayOutSpawnEntityLiving> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
