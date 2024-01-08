package me.meep_xd.xpgiveshealth;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class XPListener implements Listener {
    public XPListener(XPGivesHealth plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void XPHealth(PlayerExpChangeEvent event) {
        event.getPlayer().setMaxHealth(20 + 2*event.getPlayer().getLevel());
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        event.getPlayer().setMaxHealth(20);

    }
}
