package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInBeacon extends WrappedPacket<WrappedPlayInBeacon> {

    public WrappedPlayInBeacon(Object rawPacket, PacketContainer<WrappedPlayInBeacon> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
