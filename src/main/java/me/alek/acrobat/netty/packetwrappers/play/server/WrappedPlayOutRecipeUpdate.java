package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutRecipeUpdate extends WrappedPacket<WrappedPlayOutRecipeUpdate> {

    public WrappedPlayOutRecipeUpdate(Object rawPacket, PacketContainer<WrappedPlayOutRecipeUpdate> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
