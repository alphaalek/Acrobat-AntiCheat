package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutUpdateAttributes extends WrappedPacket<WrappedPlayOutUpdateAttributes> {

    public WrappedPlayOutUpdateAttributes(Object rawPacket, PacketContainer<WrappedPlayOutUpdateAttributes> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
