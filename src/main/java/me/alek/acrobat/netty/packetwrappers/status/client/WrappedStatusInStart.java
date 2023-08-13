package me.alek.acrobat.netty.packetwrappers.status.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedStatusInStart extends WrappedPacket<WrappedStatusInStart> {

    public WrappedStatusInStart(Object rawPacket, PacketContainer<WrappedStatusInStart> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
