package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutPlayerInfo extends WrappedPacket<WrappedPlayOutPlayerInfo> {

    public WrappedPlayOutPlayerInfo(Object rawPacket, PacketContainer<WrappedPlayOutPlayerInfo> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
