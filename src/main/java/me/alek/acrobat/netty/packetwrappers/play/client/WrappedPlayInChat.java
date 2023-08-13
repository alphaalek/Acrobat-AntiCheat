package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInChat extends WrappedPacket<WrappedPlayInChat> {

    public WrappedPlayInChat(Object rawPacket, PacketContainer<WrappedPlayInChat> packetContainer) {
        super(rawPacket, packetContainer);
    }

    public String getMessage() {
        return getContainer().getStrings().readField(0);
    }
}
