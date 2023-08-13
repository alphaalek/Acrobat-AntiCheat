package me.alek.honey.checks;

import me.alek.honey.netty.api.packet.container.PacketContainer;
import me.alek.honey.netty.packetwrappers.WrappedPacket;
import me.alek.honey.player.AcrobatPlayer;

public abstract class Check<WP extends WrappedPacket<WP>> implements ACCheck {

    private final AcrobatPlayer player;

    public Check(AcrobatPlayer player) {

        this.player = player;
    }

    @Override
    public <WP2 extends WrappedPacket<WP2>> void check(PacketContainer<WP2> packetContainer) {
        PacketContainer<WP> packetContainerParameterized = (PacketContainer<WP>) packetContainer;

        handle(packetContainerParameterized);
    }

    protected abstract void handle(PacketContainer<WP> packetContainer);

    @Override
    public AcrobatPlayer getPlayer() {
        return player;
    }

}
