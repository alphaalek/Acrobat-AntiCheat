package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutSpawnEntityExperienceOrb extends WrappedPacket<WrappedPlayOutSpawnEntityExperienceOrb> {

    public WrappedPlayOutSpawnEntityExperienceOrb(Object rawPacket, PacketContainer<WrappedPlayOutSpawnEntityExperienceOrb> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
