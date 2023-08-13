package me.alek.acrobat.netty.listener;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packet.type.PacketBound;
import me.alek.acrobat.netty.packet.type.PacketTypeEnum;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import org.bukkit.entity.Player;

public class SyncPacketAdapter<WP extends WrappedPacket<WP>> {

    public void onPacketReceive(Player player, PacketContainer<WP> packetContainer) throws Exception {

    }

    public void onPacketSend(Player player, PacketContainer<WP> packetContainer) throws Exception {

    }

    public void onPacketCancel(Player player, PacketContainer<WP> packetContainer, PacketBound bound) {

    }

    public void onPacketError(Player player, PacketTypeEnum packetType, PacketContainer<WP> packetContainer) {

    }
}
