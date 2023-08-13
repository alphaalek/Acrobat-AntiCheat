package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutBlockBreakAnimation extends WrappedPacket<WrappedPlayOutBlockBreakAnimation> {

    public WrappedPlayOutBlockBreakAnimation(Object rawPacket, PacketContainer<WrappedPlayOutBlockBreakAnimation> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
