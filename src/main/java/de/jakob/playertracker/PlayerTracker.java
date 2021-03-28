package de.jakob.playertracker;

import de.jakob.playertracker.configuration.ColorConfig;
import de.jakob.playertracker.listener.LeaveListener;
import de.jakob.playertracker.command.TrackCommand;
import de.jakob.playertracker.configuration.TickConfig;
import de.jakob.playertracker.util.BossBarUtil;
import de.jakob.playertracker.util.TrackUtil;
import org.bukkit.Bukkit;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerTracker extends JavaPlugin {

    private static PlayerTracker plugin;

    private Map<UUID, Boolean> isTracking = new HashMap<UUID, Boolean>();

    private Map<UUID, BossBar> playerBar = new HashMap<UUID, BossBar>();

    private ColorConfig colorConfig = new ColorConfig(this);

    private TickConfig tickConfig = new TickConfig(this);

    private BossBarUtil bossBarUtil = new BossBarUtil(this);

    private TrackUtil trackUtil = new TrackUtil(this);

    @Override
    public void onEnable() {

        plugin = this;

        this.getCommand("track").setExecutor(new TrackCommand(this));

        PluginManager pluginManager = Bukkit.getServer().getPluginManager();
        pluginManager.registerEvents(new LeaveListener(this), this);

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Bukkit.getScheduler().runTaskTimer(plugin, new Runnable() {

            @Override
            public void run() {

                for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                    if (isTracking.containsKey(onlinePlayer.getUniqueId())) {
                        if (isTracking.get(onlinePlayer.getUniqueId())) {

                            plugin.getTrackUtil().doTrack(onlinePlayer);

                        }
                    }
                }

            }
        }, 0, plugin.getTickConfig().updateTicks());

    }

    public Map<UUID, Boolean> getIsTracking() {
        return isTracking;
    }

    public Map<UUID, BossBar> getPlayerBar() {
        return playerBar;
    }

    public ColorConfig getColorConfig() {
        return colorConfig;
    }

    public TickConfig getTickConfig() {
        return tickConfig;
    }

    public BossBarUtil getBossBarUtil() {
        return bossBarUtil;
    }

    public TrackUtil getTrackUtil() {
        return trackUtil;
    }

}
