package me.memeszz.welcomer;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Memeszz
 */

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    private void onJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage("" + event.getPlayer().getName() + " Welcome to Server");
    }
}
