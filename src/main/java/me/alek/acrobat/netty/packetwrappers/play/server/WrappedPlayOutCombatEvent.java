package me.alek.acrobat.netty.packetwrappers.play.server;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayOutCombatEvent extends WrappedPacket<WrappedPlayOutCombatEvent> {

    public WrappedPlayOutCombatEvent(Object rawPacket, PacketContainer<WrappedPlayOutCombatEvent> packetContainer) {
        super(rawPacket, packetContainer);
    }
}
