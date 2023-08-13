package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutSelectAdvancementTab extends WrappedPacket<WrappedPlayOutSelectAdvancementTab> {

    public WrappedPlayOutSelectAdvancementTab(Object rawPacket, PacketContainer<WrappedPlayOutSelectAdvancementTab> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
