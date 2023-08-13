package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInStruct extends WrappedPacket<WrappedPlayInStruct> {

    public WrappedPlayInStruct(Object rawPacket, PacketContainer<WrappedPlayInStruct> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
