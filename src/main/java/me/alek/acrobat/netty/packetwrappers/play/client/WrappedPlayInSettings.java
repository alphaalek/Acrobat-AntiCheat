package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInSettings extends WrappedPacket<WrappedPlayInSettings> {

    public WrappedPlayInSettings(Object rawPacket, PacketContainer<WrappedPlayInSettings> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
