package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInEntityAction extends WrappedPacket<WrappedPlayInEntityAction> {

    public WrappedPlayInEntityAction(Object rawPacket, PacketContainer<WrappedPlayInEntityAction> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
