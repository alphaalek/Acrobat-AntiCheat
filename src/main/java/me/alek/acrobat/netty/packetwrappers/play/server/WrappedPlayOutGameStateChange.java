package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutGameStateChange extends WrappedPacket<WrappedPlayOutGameStateChange> {

    public WrappedPlayOutGameStateChange(Object rawPacket, PacketContainer<WrappedPlayOutGameStateChange> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
