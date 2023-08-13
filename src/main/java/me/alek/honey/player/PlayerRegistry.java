package me.alek.honey.player;

import me.alek.honey.AcrobatPlugin;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerRegistry {

    private static final Map<UUID, AcrobatPlayer> acrobatPlayerLookup = new HashMap<>();

    public static void register(Player player) {
        AcrobatPlayer acrobatPlayer = new AcrobatPlayer(player);
        AcrobatPlugin.get().getDistributor().setup(acrobatPlayer);

        acrobatPlayerLookup.put(player.getUniqueId(), acrobatPlayer);
    }

    public static void unregister(Player player) {
        AcrobatPlayer acrobatPlayer = getPlayer(player);
        AcrobatPlugin.get().getDistributor().terminate(acrobatPlayer);

        acrobatPlayerLookup.remove(player.getUniqueId());
    }

    public static void unregister(AcrobatPlayer player) { unregister(player.getHandle()); }

    public static AcrobatPlayer getPlayer(Player player) { return getPlayer(player.getUniqueId()); }

    public static AcrobatPlayer getPlayer(UUID uuid) { return acrobatPlayerLookup.get(uuid); }
}
