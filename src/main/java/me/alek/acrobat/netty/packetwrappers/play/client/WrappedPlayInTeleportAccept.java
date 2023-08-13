package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInTeleportAccept extends WrappedPacket<WrappedPlayInTeleportAccept> {

    public WrappedPlayInTeleportAccept(Object rawPacket, PacketContainer<WrappedPlayInTeleportAccept> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
