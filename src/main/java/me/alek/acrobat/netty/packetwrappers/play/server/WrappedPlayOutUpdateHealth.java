package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutUpdateHealth extends WrappedPacket<WrappedPlayOutUpdateHealth> {

    public WrappedPlayOutUpdateHealth(Object rawPacket, PacketContainer<WrappedPlayOutUpdateHealth> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
