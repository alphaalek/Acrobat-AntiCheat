package me.alek.honey.player;

import org.bukkit.entity.Player;

public class AcrobatPlayer {

    private final Player handle;

    public AcrobatPlayer(Player handle) {
        this.handle = handle;
    }

    public Player getHandle() {
        return handle;
    }

}
