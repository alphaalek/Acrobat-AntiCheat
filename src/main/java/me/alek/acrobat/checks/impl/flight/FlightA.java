package me.alek.acrobat.checks.impl.flight;

import me.alek.acrobat.checks.Check;
import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.play.client.common.WrappedAbstractPositional;
import me.alek.acrobat.player.AcrobatPlayer;

public class FlightA<WP extends WrappedAbstractPositional<WP>> extends Check<WP> {

    public FlightA(AcrobatPlayer player) {
        super(player);
    }

    @Override
    public void handle(PacketContainer<WP> packetContainer) {

    }
}
