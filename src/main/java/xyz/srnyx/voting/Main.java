package xyz.srnyx.voting;

import github.scarsz.discordsrv.DiscordSRV;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // Start messages
        getLogger().info(ChatColor.DARK_PURPLE + "--------------------");
        getLogger().info(ChatColor.LIGHT_PURPLE + "    Voting " + getDescription().getVersion());
        getLogger().info(ChatColor.LIGHT_PURPLE + "      by srnyx");
        getLogger().info(ChatColor.DARK_PURPLE + "--------------------");

        // DiscordSRV listeners
        DiscordSRV.api.subscribe(new DiscordListener());
    }
}