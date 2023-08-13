package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutOpenBook extends WrappedPacket<WrappedPlayOutOpenBook> {

    public WrappedPlayOutOpenBook(Object rawPacket, PacketContainer<WrappedPlayOutOpenBook> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
