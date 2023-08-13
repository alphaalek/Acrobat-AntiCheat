package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.play.client.WrappedPlayInFlying;

public class WrappedPlayOutPosition extends WrappedPlayInFlying<WrappedPlayOutPosition> {

    public WrappedPlayOutPosition(Object rawPacket, PacketContainer<WrappedPlayOutPosition> packetContainer) {
        super(rawPacket, packetContainer);
    }

}
