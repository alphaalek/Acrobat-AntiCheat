package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutHeldItemSlot extends WrappedPacket<WrappedPlayOutHeldItemSlot> {

    public WrappedPlayOutHeldItemSlot(Object rawPacket, PacketContainer<WrappedPlayOutHeldItemSlot> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
