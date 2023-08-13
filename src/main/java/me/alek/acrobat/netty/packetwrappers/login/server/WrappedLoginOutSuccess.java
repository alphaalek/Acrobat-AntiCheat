package me.alek.acrobat.netty.packetwrappers.login.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginOutSuccess extends WrappedPacket<WrappedLoginOutSuccess> {

    public WrappedLoginOutSuccess(Object rawPacket, PacketContainer<WrappedLoginOutSuccess> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
