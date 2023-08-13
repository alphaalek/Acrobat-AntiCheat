package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutMap extends WrappedPacket<WrappedPlayOutMap> {

    public WrappedPlayOutMap(Object rawPacket, PacketContainer<WrappedPlayOutMap> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
