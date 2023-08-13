package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutAutoRecipe extends WrappedPacket<WrappedPlayOutAutoRecipe> {

    public WrappedPlayOutAutoRecipe(Object rawPacket, PacketContainer<WrappedPlayOutAutoRecipe> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
