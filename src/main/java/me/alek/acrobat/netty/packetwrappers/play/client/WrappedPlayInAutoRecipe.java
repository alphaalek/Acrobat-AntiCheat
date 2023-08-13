package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInAutoRecipe extends WrappedPacket<WrappedPlayInAutoRecipe> {

    public WrappedPlayInAutoRecipe(Object rawPacket, PacketContainer<WrappedPlayInAutoRecipe> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
