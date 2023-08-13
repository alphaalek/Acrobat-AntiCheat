package me.alek.acrobat.netty.packetwrappers.login.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginOutCustomPayload extends WrappedPacket<WrappedLoginOutCustomPayload> {

    public WrappedLoginOutCustomPayload(Object rawPacket, PacketContainer<WrappedLoginOutCustomPayload> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
