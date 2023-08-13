package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInSetCommandMinecart extends WrappedPacket<WrappedPlayInSetCommandMinecart> {

    public WrappedPlayInSetCommandMinecart(Object rawPacket, PacketContainer<WrappedPlayInSetCommandMinecart> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
