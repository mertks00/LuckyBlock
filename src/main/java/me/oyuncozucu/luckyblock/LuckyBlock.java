package me.oyuncozucu.luckyblock;

import me.oyuncozucu.luckyblock.listeners.BlockListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LuckyBlock extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new BlockListener(), this);

    }

}
