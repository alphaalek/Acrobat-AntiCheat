package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutRemoveEntityEffect extends WrappedPacket<WrappedPlayOutRemoveEntityEffect> {

    public WrappedPlayOutRemoveEntityEffect(Object rawPacket, PacketContainer<WrappedPlayOutRemoveEntityEffect> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
