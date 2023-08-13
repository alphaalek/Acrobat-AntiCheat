package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutBoss extends WrappedPacket<WrappedPlayOutBoss> {

    public WrappedPlayOutBoss(Object rawPacket, PacketContainer<WrappedPlayOutBoss> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
