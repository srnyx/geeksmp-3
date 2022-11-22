package xyz.srnyx.geeksmp3;

import github.scarsz.discordsrv.api.Subscribe;
import github.scarsz.discordsrv.api.events.DiscordGuildMessageReceivedEvent;
import github.scarsz.discordsrv.dependencies.jda.api.entities.Message;

import org.jetbrains.annotations.NotNull;


public class DiscordListener {
    @Subscribe
    public void onGuildMessageReceive(@NotNull DiscordGuildMessageReceivedEvent event) {
        if (event.getChannel().getId().equals("1005114534916268032")) {
            final Message message = event.getMessage();
            message.addReaction("U+1F44D").queue();
            message.addReaction("U+1F44E").queue();
        }
    }
}
