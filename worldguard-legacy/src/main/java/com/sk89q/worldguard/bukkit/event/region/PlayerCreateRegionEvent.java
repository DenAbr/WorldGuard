package com.sk89q.worldguard.bukkit.event.region;

import static com.google.common.base.Preconditions.*;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;

/**
 * Posted when a player claims or defines new region using commands
 * 
 * @author Den_Abr
 *
 */
public class PlayerCreateRegionEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    private Player player;
    private ProtectedRegion region;
    private String cancelMessage;

    public PlayerCreateRegionEvent(Player player, ProtectedRegion region) {
        checkNotNull(player);
        checkNotNull(region);
        this.player = player;
        this.region = region;
    }

    public String getCancelMessage() {
        return cancelMessage;
    }

    public Player getPlayer() {
        return player;
    }

    public ProtectedRegion getRegion() {
        return region;
    }

    public void setCancelMessage(String cancelMessage) {
        this.cancelMessage = cancelMessage;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
