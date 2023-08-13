package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutWorldEvent extends WrappedPacket<WrappedPlayOutWorldEvent> {

    public WrappedPlayOutWorldEvent(Object rawPacket, PacketContainer<WrappedPlayOutWorldEvent> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
