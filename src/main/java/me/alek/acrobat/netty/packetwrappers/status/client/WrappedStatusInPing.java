package me.alek.acrobat.netty.packetwrappers.status.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedStatusInPing extends WrappedPacket<WrappedStatusInPing> {

    public WrappedStatusInPing(Object rawPacket, PacketContainer<WrappedStatusInPing> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
