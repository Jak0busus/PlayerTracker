package de.jakob.playertracker.command;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TrackCommand implements CommandExecutor {

    private PlayerTracker plugin;

    public TrackCommand(PlayerTracker plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (player.hasPermission("track.player")) {

                if (args.length == 0) {

                    if (!plugin.getIsTracking().containsKey(player.getUniqueId())) {
                       plugin.getIsTracking().put(player.getUniqueId(), false);
                    }

                    if (plugin.getIsTracking().get(player.getUniqueId())) {

                        plugin.getIsTracking().put(player.getUniqueId(), false);
                        plugin.getBossBarUtil().deleteBossBar(player);
                        player.sendMessage("§7[§5Track§7] §eYou have deactivated the tracker.");

                    } else if (!plugin.getIsTracking().get(player.getUniqueId())) {

                        plugin.getIsTracking().put(player.getUniqueId(), true);
                        plugin.getBossBarUtil().createBossBar(player);
                        plugin.getTrackUtil().doTrack(player);
                        player.sendMessage("§7[§5Track§7] §eYou have activated the tracker.");

                    }

                }
            } else {

                player.sendMessage("§7[§5Track§7] §cYou do not have the necessary permissions.");

            }
        }

        return true;

    }
}