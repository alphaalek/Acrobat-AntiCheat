package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInPickItem extends WrappedPacket<WrappedPlayInPickItem> {

    public WrappedPlayInPickItem(Object rawPacket, PacketContainer<WrappedPlayInPickItem> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
