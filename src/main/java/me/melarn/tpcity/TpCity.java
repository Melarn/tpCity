package me.melarn.tpcity;

import org.bukkit.plugin.java.JavaPlugin;

public final class TpCity extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tpcity").setExecutor(new OpenMenu());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
