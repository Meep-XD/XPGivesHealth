package me.meep_xd.xpgiveshealth;

import org.bukkit.plugin.java.JavaPlugin;

public final class XPGivesHealth extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new XPListener(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
