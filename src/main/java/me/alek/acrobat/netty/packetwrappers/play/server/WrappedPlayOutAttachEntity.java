package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutAttachEntity extends WrappedPacket<WrappedPlayOutAttachEntity> {

    public WrappedPlayOutAttachEntity(Object rawPacket, PacketContainer<WrappedPlayOutAttachEntity> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
