package me.alek.acrobat.netty.packetwrappers.login.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginOutDisconnect extends WrappedPacket<WrappedLoginOutDisconnect> {

    public WrappedLoginOutDisconnect(Object rawPacket, PacketContainer<WrappedLoginOutDisconnect> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
