package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutKickDisconnect extends WrappedPacket<WrappedPlayOutKickDisconnect> {

    public WrappedPlayOutKickDisconnect(Object rawPacket, PacketContainer<WrappedPlayOutKickDisconnect> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
