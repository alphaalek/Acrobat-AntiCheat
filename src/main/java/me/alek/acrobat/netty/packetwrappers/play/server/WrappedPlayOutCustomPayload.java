package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutCustomPayload extends WrappedPacket<WrappedPlayOutCustomPayload> {

    public WrappedPlayOutCustomPayload(Object rawPacket, PacketContainer<WrappedPlayOutCustomPayload> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
