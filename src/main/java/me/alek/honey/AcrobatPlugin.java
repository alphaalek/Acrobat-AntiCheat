package me.alek.honey;

import me.alek.honey.checks.CheckDistributor;
import me.alek.honey.listeners.PlayerJoinListener;
import me.alek.honey.netty.packetwrappers.WrappedPacket;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AcrobatPlugin extends JavaPlugin {

    private static AcrobatPlugin INSTANCE;

    private CheckDistributor<? extends WrappedPacket<?>> distributor;

    @Override
    public void onEnable() {
        INSTANCE = this;

        // register bukkit events to be listened to
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);

        // setup the check distributor
        distributor = new CheckDistributor<>();
    }

    @Override
    public void onDisable() { }

    public static AcrobatPlugin get() { return INSTANCE; }

    public CheckDistributor<? extends WrappedPacket<?>> getDistributor() {
        return distributor;
    }
}
