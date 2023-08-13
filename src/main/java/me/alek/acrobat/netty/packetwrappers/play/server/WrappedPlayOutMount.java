package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutMount extends WrappedPacket<WrappedPlayOutMount> {

    public WrappedPlayOutMount(Object rawPacket, PacketContainer<WrappedPlayOutMount> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
