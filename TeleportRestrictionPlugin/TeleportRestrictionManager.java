package com.example.teleportrestriction;

import org.bukkit.entity.Player;

public class TeleportRestrictionManager 
{

    private final TeleportRestriction restriction;

    public TeleportRestrictionManager(TeleportRestriction restriction) 
    {
        this.restriction = restriction;
    }

    public boolean isTeleportRestricted(Player player, String worldName) 
    {
        return restriction.isRestricted(player, worldName);
    }
}
