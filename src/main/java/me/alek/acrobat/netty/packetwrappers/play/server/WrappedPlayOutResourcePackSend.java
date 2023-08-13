package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutResourcePackSend extends WrappedPacket<WrappedPlayOutResourcePackSend> {

    public WrappedPlayOutResourcePackSend(Object rawPacket, PacketContainer<WrappedPlayOutResourcePackSend> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
