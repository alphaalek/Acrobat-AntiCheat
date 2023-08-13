package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutTags extends WrappedPacket<WrappedPlayOutTags> {

    public WrappedPlayOutTags(Object rawPacket, PacketContainer<WrappedPlayOutTags> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
