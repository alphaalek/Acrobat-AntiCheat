package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutEntityEffect extends WrappedPacket<WrappedPlayOutEntityEffect> {

    public WrappedPlayOutEntityEffect(Object rawPacket, PacketContainer<WrappedPlayOutEntityEffect> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
