package me.alek.acrobat.netty.api.event.impl.packet;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import org.bukkit.entity.Player;

public class PacketLoginSendEvent extends PacketEvent {

    public PacketLoginSendEvent(Player player, PacketContainer<? extends WrappedPacket<?>> packet) {
        super(player, packet);
    }
}
