package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutWindowData extends WrappedPacket<WrappedPlayOutWindowData> {

    public WrappedPlayOutWindowData(Object rawPacket, PacketContainer<WrappedPlayOutWindowData> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
