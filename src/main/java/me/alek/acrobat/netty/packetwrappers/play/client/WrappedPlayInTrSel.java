package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInTrSel extends WrappedPacket<WrappedPlayInTrSel> {

    public WrappedPlayInTrSel(Object rawPacket, PacketContainer<WrappedPlayInTrSel> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
