package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInRecipeDisplayed extends WrappedPacket<WrappedPlayInRecipeDisplayed> {

    public WrappedPlayInRecipeDisplayed(Object rawPacket, PacketContainer<WrappedPlayInRecipeDisplayed> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
