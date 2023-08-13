package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutExperience extends WrappedPacket<WrappedPlayOutExperience> {

    public WrappedPlayOutExperience(Object rawPacket, PacketContainer<WrappedPlayOutExperience> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
