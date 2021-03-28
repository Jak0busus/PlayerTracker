package de.jakob.playertracker.configuration;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.boss.BarColor;

public class ColorConfig {

    public static BarColor color(PlayerTracker plugin) {

        String color = String.valueOf(plugin.getConfig().get("color"));

        return BarColor.valueOf(color.toUpperCase());

    }

}
