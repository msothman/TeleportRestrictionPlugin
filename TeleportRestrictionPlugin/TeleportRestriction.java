package com.example.teleportrestriction;

import org.bukkit.entity.Player;

public interface TeleportRestriction 
{
    boolean isRestricted(Player player, String worldName);
}
