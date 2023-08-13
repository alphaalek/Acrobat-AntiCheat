package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutLogin extends WrappedPacket<WrappedPlayOutLogin> {

    public WrappedPlayOutLogin(Object rawPacket, PacketContainer<WrappedPlayOutLogin> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
