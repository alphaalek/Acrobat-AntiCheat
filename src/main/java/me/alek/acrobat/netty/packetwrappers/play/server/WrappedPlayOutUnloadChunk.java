package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutUnloadChunk extends WrappedPacket<WrappedPlayOutUnloadChunk> {

    public WrappedPlayOutUnloadChunk(Object rawPacket, PacketContainer<WrappedPlayOutUnloadChunk> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
