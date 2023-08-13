package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInSetJigsaw extends WrappedPacket<WrappedPlayInSetJigsaw> {

    public WrappedPlayInSetJigsaw(Object rawPacket, PacketContainer<WrappedPlayInSetJigsaw> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
