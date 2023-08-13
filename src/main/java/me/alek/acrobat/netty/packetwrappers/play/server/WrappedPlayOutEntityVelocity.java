package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutEntityVelocity extends WrappedPacket<WrappedPlayOutEntityVelocity> {

    public WrappedPlayOutEntityVelocity(Object rawPacket, PacketContainer<WrappedPlayOutEntityVelocity> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
