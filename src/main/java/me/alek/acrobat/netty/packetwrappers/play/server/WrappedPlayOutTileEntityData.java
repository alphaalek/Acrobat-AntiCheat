package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutTileEntityData extends WrappedPacket<WrappedPlayOutTileEntityData> {

    public WrappedPlayOutTileEntityData(Object rawPacket, PacketContainer<WrappedPlayOutTileEntityData> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
