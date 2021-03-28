package de.jakob.playertracker.util;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TrackUtil {

    private PlayerTracker plugin;

    public TrackUtil(PlayerTracker plugin) {
        this.plugin = plugin;
    }
    
    public void doTrack(Player player) {

        String tracking = "none";
        int distance = 0;

        int i = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            if (!onlinePlayer.equals(player)) {

                if (onlinePlayer.getWorld().equals(player.getWorld())) {

                    int newDistance = (int) onlinePlayer.getLocation().distance(player.getLocation());

                    if (newDistance < distance || tracking.equals("none")) {

                        distance = newDistance;
                        tracking = onlinePlayer.getName();

                        i++;

                    }
                }
            }
        }

        if (i == 0) {
            distance = 0;
            tracking = "none";
        }

        plugin.getBossBarUtil().sendBossBar(player, tracking, distance);

    }

}
