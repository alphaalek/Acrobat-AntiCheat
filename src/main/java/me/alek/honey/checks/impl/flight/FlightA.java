package me.alek.honey.checks.impl.flight;

import me.alek.honey.checks.Check;
import me.alek.honey.netty.api.packet.container.PacketContainer;
import me.alek.honey.netty.packetwrappers.play.client.common.WrappedAbstractPositional;
import me.alek.honey.player.AcrobatPlayer;

public class FlightA<WP extends WrappedAbstractPositional<WP>> extends Check<WP> {

    public FlightA(AcrobatPlayer player) {
        super(player);
    }

    @Override
    public void handle(PacketContainer<WP> packetContainer) {

    }
}
