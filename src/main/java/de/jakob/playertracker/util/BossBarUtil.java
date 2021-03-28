package de.jakob.playertracker.util;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossBarUtil {

    private PlayerTracker plugin;

    public BossBarUtil(PlayerTracker plugin) {
        this.plugin = plugin;
    }

    public void sendBossBar(Player player, String tracking, Integer distance) {

        //player.sendMessage(tracking + " is " + distance + " blocks away from you.");

        BossBar bar = plugin.getPlayerBar().get(player.getUniqueId());
        bar.setTitle("§e"
                + tracking
                + " §7[§5"
                + distance
                + "§7]");
    }

    public void createBossBar(Player player) {

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

    public void deleteBossBar(Player player) {

        BossBar bar = plugin.getPlayerBar().get(player.getUniqueId());

        bar.removeAll();

        plugin.getPlayerBar().remove(player.getUniqueId());
    }


}
