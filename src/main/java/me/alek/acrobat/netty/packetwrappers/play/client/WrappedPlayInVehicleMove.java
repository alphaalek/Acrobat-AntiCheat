package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;

public class WrappedPlayInVehicleMove extends WrappedPlayInFlying<WrappedPlayInVehicleMove> {

    public WrappedPlayInVehicleMove(Object rawPacket, PacketContainer<WrappedPlayInVehicleMove> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
