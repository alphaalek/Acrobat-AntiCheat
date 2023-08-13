package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInRecipeSettings extends WrappedPacket<WrappedPlayInRecipeSettings> {

    public WrappedPlayInRecipeSettings(Object rawPacket, PacketContainer<WrappedPlayInRecipeSettings> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
