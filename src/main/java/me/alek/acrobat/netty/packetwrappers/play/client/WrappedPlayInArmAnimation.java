package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInArmAnimation extends WrappedPacket<WrappedPlayInArmAnimation> {

    public WrappedPlayInArmAnimation(Object rawPacket, PacketContainer<WrappedPlayInArmAnimation> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
