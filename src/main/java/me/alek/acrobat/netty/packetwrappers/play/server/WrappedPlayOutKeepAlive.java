package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutKeepAlive extends WrappedPacket<WrappedPlayOutKeepAlive> {

    public WrappedPlayOutKeepAlive(Object rawPacket, PacketContainer<WrappedPlayOutKeepAlive> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
