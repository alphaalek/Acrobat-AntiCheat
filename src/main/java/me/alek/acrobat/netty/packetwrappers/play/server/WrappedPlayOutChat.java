package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutChat extends WrappedPacket<WrappedPlayOutChat> {

    public WrappedPlayOutChat(Object rawPacket, PacketContainer<WrappedPlayOutChat> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
