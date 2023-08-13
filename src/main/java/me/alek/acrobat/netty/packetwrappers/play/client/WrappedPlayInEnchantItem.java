package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInEnchantItem extends WrappedPacket<WrappedPlayInEnchantItem> {

    public WrappedPlayInEnchantItem(Object rawPacket, PacketContainer<WrappedPlayInEnchantItem> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
