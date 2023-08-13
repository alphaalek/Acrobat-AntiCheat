package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInResourcePackStatus extends WrappedPacket<WrappedPlayInResourcePackStatus> {

    public WrappedPlayInResourcePackStatus(Object rawPacket, PacketContainer<WrappedPlayInResourcePackStatus> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
