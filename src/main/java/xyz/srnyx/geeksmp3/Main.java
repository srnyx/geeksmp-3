package xyz.srnyx.geeksmp3;

import github.scarsz.discordsrv.DiscordSRV;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // Start messages
        final StringBuilder authors = new StringBuilder();
        boolean first = true;
        for (final String author : getDescription().getAuthors()) {
            if (first) {
                authors.append(author);
                first = false;
                continue;
            }
            authors.append(", ").append(author);
        }
        final Logger logger = getLogger();
        logger.info(ChatColor.DARK_PURPLE + "------------------");
        logger.info(ChatColor.LIGHT_PURPLE + " " + getName() + " v" + getDescription().getVersion());
        logger.info(ChatColor.LIGHT_PURPLE + " Created by " + authors);
        logger.info(ChatColor.DARK_PURPLE + "------------------");

        // DiscordSRV listeners
        DiscordSRV.api.subscribe(new DiscordListener());
    }
}