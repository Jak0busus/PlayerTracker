package de.jakob.playertracker.configuration;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.boss.BarColor;

public class ColorConfig {

    private PlayerTracker plugin;

    public ColorConfig(PlayerTracker plugin) {
        this.plugin = plugin;
    }

    public BarColor color() {

        String color = String.valueOf(plugin.getConfig().get("color"));

        return BarColor.valueOf(color.toUpperCase());

    }

}
