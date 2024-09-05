package com.example.teleportrestriction;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.List;

public class ConfigTeleportRestriction implements TeleportRestriction 
{

    private final FileConfiguration config;

    public ConfigTeleportRestriction(FileConfiguration config) 
    {
        this.config = config;
    }

    @Override
    public boolean isRestricted(Player player, String worldName) 
    {
        List<String> restrictedWorlds = config.getStringList("restricted-worlds");
        return restrictedWorlds.contains(worldName) && !player.hasPermission("enterworld.permission");
    }
}
