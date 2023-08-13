package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutTitle extends WrappedPacket<WrappedPlayOutTitle> {

    public WrappedPlayOutTitle(Object rawPacket, PacketContainer<WrappedPlayOutTitle> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
