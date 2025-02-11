package org.joels.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.RED + "Stop Moving! You are Frozen");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e){
        e.getPlayer().sendMessage("You just threw an egg!");
    }
}
