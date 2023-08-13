package me.alek.acrobat.netty.packetwrappers.status.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedStatusOutServerInfo extends WrappedPacket<WrappedStatusOutServerInfo> {

    public WrappedStatusOutServerInfo(Object rawPacket, PacketContainer<WrappedStatusOutServerInfo> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
