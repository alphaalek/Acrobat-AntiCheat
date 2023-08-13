package me.alek.honey.checks;

import me.alek.honey.netty.api.packet.container.PacketContainer;
import me.alek.honey.netty.packetwrappers.WrappedPacket;
import me.alek.honey.player.AcrobatPlayer;
import me.alek.honey.netty.api.packet.ListenerPriority;

public interface ACCheck {

    default ListenerPriority getPriority() { return ListenerPriority.NORMAL; }

    AcrobatPlayer getPlayer();

    <WP extends WrappedPacket<WP>> void check(PacketContainer<WP> packetContainer);
}
