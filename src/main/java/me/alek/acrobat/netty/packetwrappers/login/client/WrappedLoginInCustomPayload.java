package me.alek.acrobat.netty.packetwrappers.login.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginInCustomPayload extends WrappedPacket<WrappedLoginInCustomPayload> {

    public WrappedLoginInCustomPayload(Object rawPacket, PacketContainer<WrappedLoginInCustomPayload> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
