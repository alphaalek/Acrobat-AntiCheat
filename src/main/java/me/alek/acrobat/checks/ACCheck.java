package me.alek.acrobat.checks;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import me.alek.acrobat.player.AcrobatPlayer;
import me.alek.acrobat.netty.api.packet.ListenerPriority;

public interface ACCheck {

    default ListenerPriority getPriority() { return ListenerPriority.NORMAL; }

    AcrobatPlayer getPlayer();

    <WP extends WrappedPacket<WP>> void check(PacketContainer<WP> packetContainer);
}
