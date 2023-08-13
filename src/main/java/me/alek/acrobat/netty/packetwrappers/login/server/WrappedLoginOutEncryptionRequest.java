package me.alek.acrobat.netty.packetwrappers.login.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginOutEncryptionRequest extends WrappedPacket<WrappedLoginOutEncryptionRequest> {

    public WrappedLoginOutEncryptionRequest(Object rawPacket, PacketContainer<WrappedLoginOutEncryptionRequest> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
