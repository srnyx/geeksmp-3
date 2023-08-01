package xyz.srnyx.geeksmp3;

import github.scarsz.discordsrv.DiscordSRV;

import xyz.srnyx.annoyingapi.AnnoyingPlugin;
import xyz.srnyx.annoyingapi.PluginPlatform;
import xyz.srnyx.annoyingapi.dependency.AnnoyingDependency;


public class GeekSMP3 extends AnnoyingPlugin {
    public GeekSMP3() {
        options.pluginOptions.dependencies.add(new AnnoyingDependency("DiscordSRV", true, false, PluginPlatform.spigot("18494")));
    }

    @Override
    public void enable() {
        DiscordSRV.api.subscribe(new DiscordListener());
    }
}
