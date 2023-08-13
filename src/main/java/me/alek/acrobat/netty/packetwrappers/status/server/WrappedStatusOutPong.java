package me.alek.acrobat.netty.packetwrappers.status.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedStatusOutPong extends WrappedPacket<WrappedStatusOutPong> {

    public WrappedStatusOutPong(Object rawPacket, PacketContainer<WrappedStatusOutPong> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
