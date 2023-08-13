package me.alek.acrobat.netty.packetwrappers.login.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginInEncryptionResponse extends WrappedPacket<WrappedLoginInEncryptionResponse> {

    public WrappedLoginInEncryptionResponse(Object rawPacket, PacketContainer<WrappedLoginInEncryptionResponse> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
