package de.jakob.playertracker.configuration;

import de.jakob.playertracker.PlayerTracker;

public class TickConfig {

    private PlayerTracker plugin;

    public TickConfig(PlayerTracker plugin) {
        this.plugin = plugin;
    }

    public int updateTicks() {

        return (int) plugin.getConfig().get("ticks");

    }

}
