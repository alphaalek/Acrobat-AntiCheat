package me.alek.acrobat.netty.api.packet.container;

import io.netty.channel.Channel;
import me.alek.acrobat.netty.packet.type.PacketState;
import me.alek.acrobat.netty.packet.type.PacketTypeEnum;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import org.bukkit.entity.Player;

public interface PacketContainer<WP extends WrappedPacket<WP>> extends ModifiablePacketContainer {

    Channel getChannel();

    PacketTypeEnum getType();

    PacketState getState();

    WP getPacket();

    Runnable getPost();

    Player getPlayer();

    Object getHandle();

    boolean isCancelled();

    void cancel();

}
