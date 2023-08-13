package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutEntity extends WrappedPacket<WrappedPlayOutEntity> {

    public WrappedPlayOutEntity(Object rawPacket, PacketContainer<WrappedPlayOutEntity> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
