package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;

public class WrappedPlayInLook extends WrappedPlayInFlying<WrappedPlayInLook> {

    public WrappedPlayInLook(Object rawPacket, PacketContainer<WrappedPlayInLook> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
