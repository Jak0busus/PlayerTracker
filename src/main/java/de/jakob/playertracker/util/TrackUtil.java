package de.jakob.playertracker.util;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TrackUtil {

    public static void doTrack(Player player, PlayerTracker plugin) {

        String tracking = "none";
        int distance = 0;

        int i = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            if (onlinePlayer.equals(player)) {
                continue;
            }
            if (!onlinePlayer.getWorld().equals(player.getWorld())) {
                continue;
            }
            int newDistance = (int) onlinePlayer.getLocation().distance(player.getLocation());

            if (newDistance < distance || tracking.equals("none")) {

                distance = newDistance;
                tracking = onlinePlayer.getName();

                i++;

            }

        }

        if (i == 0) {
            distance = 0;
            tracking = "none";
        }

        BossBarUtil.sendBossBar(player, tracking, distance, plugin);

    }

}
