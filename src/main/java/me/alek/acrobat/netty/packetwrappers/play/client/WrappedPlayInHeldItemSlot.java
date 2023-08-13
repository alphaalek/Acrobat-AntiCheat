package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInHeldItemSlot extends WrappedPacket<WrappedPlayInHeldItemSlot> {

    public WrappedPlayInHeldItemSlot(Object rawPacket, PacketContainer<WrappedPlayInHeldItemSlot> packetContainer) {
        super(rawPacket, packetContainer);
    }

    public int getSlot() {
        return getContainer().getInts().readField(0);
    }
}
