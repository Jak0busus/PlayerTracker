package de.jakob.playertracker.util;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossBarUtil {

    public static void sendBossBar(Player player, String tracking, Integer distance, PlayerTracker plugin) {

        //player.sendMessage(tracking + " is " + distance + " blocks away from you.");

        BossBar bar = plugin.getPlayerBar().get(player.getUniqueId());
        bar.setTitle("§e"
                + tracking
                + " §7[§5"
                + distance
                + "§7]");
    }

    public static void createBossBar(Player player, PlayerTracker plugin) {

        BossBar bar;

        bar = Bukkit.createBossBar("§e"
                        + "none"
                        + " §7[§5"
                        + "0"
                        + "§7]",
                plugin.getColorConfig().color(),
                BarStyle.SOLID);

        bar.addPlayer(player);
        bar.setVisible(true);

        plugin.getPlayerBar().put(player.getUniqueId(), bar);
    }

    public static void deleteBossBar(Player player, PlayerTracker plugin) {

        BossBar bar = plugin.getPlayerBar().get(player.getUniqueId());

        bar.removeAll();

        plugin.getPlayerBar().remove(player.getUniqueId());
    }


}
