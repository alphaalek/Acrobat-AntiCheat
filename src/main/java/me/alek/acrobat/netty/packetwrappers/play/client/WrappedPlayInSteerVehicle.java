package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInSteerVehicle extends WrappedPacket<WrappedPlayInSteerVehicle> {

    public WrappedPlayInSteerVehicle(Object rawPacket, PacketContainer<WrappedPlayInSteerVehicle> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
