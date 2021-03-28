package de.jakob.playertracker.listener;

import de.jakob.playertracker.PlayerTracker;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveListener implements Listener {

    private final PlayerTracker plugin;

    public LeaveListener(PlayerTracker plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent leaveevent) {

        Player player = leaveevent.getPlayer();

        if (plugin.getPlayerBar().containsKey(player.getUniqueId())) {
            plugin.getBossBarUtil().deleteBossBar(player);
        }

        plugin.getIsTracking().remove(player.getUniqueId());
    }

}
