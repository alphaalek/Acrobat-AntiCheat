package me.alek.acrobat.netty.packetwrappers.login.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginOutSetCompression extends WrappedPacket<WrappedLoginOutSetCompression> {

    public WrappedLoginOutSetCompression(Object rawPacket, PacketContainer<WrappedLoginOutSetCompression> packetContainer) {
        super(rawPacket, packetContainer);
    }

    public int getCompressionSize() {
        return getContainer().getInts().readField(0);
    }
}
