package me.alek.acrobat.checks;

import me.alek.acrobat.player.AcrobatPlayer;
import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.listener.SyncPacketAdapter;
import me.alek.acrobat.netty.packet.type.PacketTypeEnum;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import org.bukkit.entity.Player;

import java.util.*;

public class CheckDistributor<WP extends WrappedPacket<WP>> extends SyncPacketAdapter<WP> {

    private final Set<PacketTypeEnum> registeredPacketTypes = new HashSet<>();
    private final Map<PacketTypeEnum, List<ACCheck>> lookupChecks = new HashMap<>();

    private void distribute(PacketContainer<WP> packetContainer) {
        PacketTypeEnum packetType = packetContainer.getType();
        if (!registeredPacketTypes.contains(packetType)) return;

        for (ACCheck check : lookupChecks.get(packetType)) {
            check.check(packetContainer);
        }
    }

    @Override
    public void onPacketReceive(Player player, PacketContainer<WP> packetContainer) {
        distribute(packetContainer);
    }

    @Override
    public void onPacketSend(Player player, PacketContainer<WP> packetContainer) {
        distribute(packetContainer);
    }

    public void setup(AcrobatPlayer player) {
        Map<ACCheck, List<PacketTypeEnum>> checks = CheckRegistry.createChecks(player);

        for (Map.Entry<ACCheck, List<PacketTypeEnum>> packetEntry : checks.entrySet()) {

            for (PacketTypeEnum packetType : packetEntry.getValue()) {

                registeredPacketTypes.add(packetType);

                if (!lookupChecks.containsKey(packetType)) lookupChecks.put(packetType, new ArrayList<>());
                lookupChecks.get(packetType).add(packetEntry.getKey());
            }
        }
    }

    public void terminate(AcrobatPlayer player) {
        lookupChecks.entrySet().removeIf((checksEntry) -> {

            List<ACCheck> checks = checksEntry.getValue();

            return !checks.isEmpty() && checks.get(0).getPlayer() == player;
        });
    }

}
