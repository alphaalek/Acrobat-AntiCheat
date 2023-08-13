package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;

public class WrappedPlayInPosition extends WrappedPlayInFlying<WrappedPlayInPosition> {

    public WrappedPlayInPosition(Object rawPacket, PacketContainer<WrappedPlayInPosition> packetContainer) {
        super(rawPacket, packetContainer);
    }

}
