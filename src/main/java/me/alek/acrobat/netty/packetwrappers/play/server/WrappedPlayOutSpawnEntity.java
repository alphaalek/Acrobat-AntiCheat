package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutSpawnEntity extends WrappedPacket<WrappedPlayOutSpawnEntity> {
    public WrappedPlayOutSpawnEntity(Object rawPacket, PacketContainer<WrappedPlayOutSpawnEntity> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
