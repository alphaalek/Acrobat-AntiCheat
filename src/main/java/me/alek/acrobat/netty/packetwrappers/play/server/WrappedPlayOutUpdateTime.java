package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutUpdateTime extends WrappedPacket<WrappedPlayOutUpdateTime> {

    public WrappedPlayOutUpdateTime(Object rawPacket, PacketContainer<WrappedPlayOutUpdateTime> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
