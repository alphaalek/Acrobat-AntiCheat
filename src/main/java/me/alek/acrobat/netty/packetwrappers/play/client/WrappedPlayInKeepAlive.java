package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInKeepAlive extends WrappedPacket<WrappedPlayInKeepAlive> {

    public WrappedPlayInKeepAlive(Object rawPacket, PacketContainer<WrappedPlayInKeepAlive> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
