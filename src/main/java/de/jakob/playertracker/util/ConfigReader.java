package de.jakob.playertracker.util;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.boss.BarColor;

public class ConfigReader {

    public static BarColor color(PlayerTracker plugin) {

        String color = String.valueOf(plugin.getConfig().get("color"));

        return BarColor.valueOf(color.toUpperCase());

    }

    public static int updateTicks(PlayerTracker plugin) {

        return plugin.getConfig().getInt("ticks");

    }

}
