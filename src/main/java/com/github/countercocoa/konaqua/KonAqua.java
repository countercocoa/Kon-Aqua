package com.github.countercocoa.konaqua;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class KonAqua extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // plugin start up msg
        getLogger().info(ChatColor.LIGHT_PURPLE +"こんあくあ～");

        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // plugin shutdown msg
        getLogger().info(ChatColor.LIGHT_PURPLE +"おつあくあ～");
    }



    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent p){
        Player e = p.getPlayer();
        //player joined msg
        p.setJoinMessage( "§l" + e.getName() + "§d" + "§l" +  " こんあくあ～");
    }
}
