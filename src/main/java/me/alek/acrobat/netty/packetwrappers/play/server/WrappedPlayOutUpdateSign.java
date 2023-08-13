package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutUpdateSign extends WrappedPacket<WrappedPlayOutUpdateSign> {

    public WrappedPlayOutUpdateSign(Object rawPacket, PacketContainer<WrappedPlayOutUpdateSign> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
