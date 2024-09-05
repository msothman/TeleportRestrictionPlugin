package com.example.teleportrestriction;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TeleportRestrictionPlugin extends JavaPlugin 
{

    private TeleportRestrictionManager teleportRestrictionManager;

    @Override
    public void onEnable() 
    {
        this.saveDefaultConfig();

        teleportRestrictionManager = new TeleportRestrictionManager(new ConfigTeleportRestriction(getConfig()));
        
        Bukkit.getPluginManager().registerEvents(new TeleportListener(teleportRestrictionManager), this);
    }
}
