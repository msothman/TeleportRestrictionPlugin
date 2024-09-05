package com.example.teleportrestriction;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class TeleportListener implements Listener 
{

    private final TeleportRestrictionManager restrictionManager;

    public TeleportListener(TeleportRestrictionManager restrictionManager) 
    {
        this.restrictionManager = restrictionManager;
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent event) 
    {
        Player player = event.getPlayer();

        if (restrictionManager.isTeleportRestricted(player, event.getTo().getWorld().getName())) 
        {
            event.setCancelled(true);
            player.sendMessage("§cYou do not have permission to teleport to this world!");
        }
    }
}
