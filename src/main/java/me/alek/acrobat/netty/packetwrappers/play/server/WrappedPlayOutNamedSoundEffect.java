package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutNamedSoundEffect extends WrappedPacket<WrappedPlayOutNamedSoundEffect> {

    public WrappedPlayOutNamedSoundEffect(Object rawPacket, PacketContainer<WrappedPlayOutNamedSoundEffect> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
