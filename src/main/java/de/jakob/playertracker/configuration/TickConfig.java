package de.jakob.playertracker.configuration;

import de.jakob.playertracker.PlayerTracker;

public class TickConfig {

    public static int updateTicks(PlayerTracker plugin) {

        return plugin.getConfig().getInt("ticks");

    }

}
