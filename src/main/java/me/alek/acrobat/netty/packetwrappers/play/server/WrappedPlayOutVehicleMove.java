package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutVehicleMove extends WrappedPacket<WrappedPlayOutVehicleMove> {

    public WrappedPlayOutVehicleMove(Object rawPacket, PacketContainer<WrappedPlayOutVehicleMove> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
