package me.alek.acrobat.netty.packetwrappers.handshake.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedHandshakeInSetProtocol extends WrappedPacket<WrappedHandshakeInSetProtocol> {

    public WrappedHandshakeInSetProtocol(Object rawPacket, PacketContainer<WrappedHandshakeInSetProtocol> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
