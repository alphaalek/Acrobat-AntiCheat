package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutRelEntityMoveLook extends WrappedPacket<WrappedPlayOutRelEntityMoveLook> {

    public WrappedPlayOutRelEntityMoveLook(Object rawPacket, PacketContainer<WrappedPlayOutRelEntityMoveLook> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
