package de.jakob.playertracker.command;

import de.jakob.playertracker.PlayerTracker;
import de.jakob.playertracker.util.BossBarUtil;
import de.jakob.playertracker.util.TrackUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TrackCommand implements CommandExecutor {

    private final PlayerTracker plugin;

    public TrackCommand(PlayerTracker plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (!player.hasPermission("playertracker.track")) {
                player.sendMessage("§8» §dSV §8× §7Dazu besitzt du leider §cnicht §7die passenden §eRechte§7!");
                return true;
            }
            if (args.length != 0) {
                return true;
            }

            if (!plugin.getIsTracking().containsKey(player.getUniqueId())) {
                plugin.getIsTracking().put(player.getUniqueId(), false);
            }

            if (plugin.getIsTracking().get(player.getUniqueId())) {

                plugin.getIsTracking().put(player.getUniqueId(), false);
                BossBarUtil.deleteBossBar(player, plugin);
                player.sendMessage("§8» §dSV §8× §7Du hast den §5Tracker §cdeaktiviert§7.");

            } else if (!plugin.getIsTracking().get(player.getUniqueId())) {

                plugin.getIsTracking().put(player.getUniqueId(), true);
                BossBarUtil.createBossBar(player, plugin);
                TrackUtil.doTrack(player, plugin);
                player.sendMessage("§8» §dSV §8× §7Du hast den §5Tracker §aaktiviert§7.");

            }


        }

        return true;

    }
}
