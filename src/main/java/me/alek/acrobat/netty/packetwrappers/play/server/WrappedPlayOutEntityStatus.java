package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutEntityStatus extends WrappedPacket<WrappedPlayOutEntityStatus> {

    public WrappedPlayOutEntityStatus(Object rawPacket, PacketContainer<WrappedPlayOutEntityStatus> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
