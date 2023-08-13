package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInBEdit extends WrappedPacket<WrappedPlayInBEdit> {

    public WrappedPlayInBEdit(Object rawPacket, PacketContainer<WrappedPlayInBEdit> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
