package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInSpectate extends WrappedPacket<WrappedPlayInSpectate> {

    public WrappedPlayInSpectate(Object rawPacket, PacketContainer<WrappedPlayInSpectate> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
