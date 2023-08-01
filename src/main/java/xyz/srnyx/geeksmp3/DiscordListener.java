package xyz.srnyx.geeksmp3;

import github.scarsz.discordsrv.api.Subscribe;
import github.scarsz.discordsrv.api.events.DiscordGuildMessageReceivedEvent;
import github.scarsz.discordsrv.dependencies.jda.api.entities.Message;

import org.jetbrains.annotations.NotNull;


public class DiscordListener {
    @Subscribe
    public void onGuildMessageReceive(@NotNull DiscordGuildMessageReceivedEvent event) {
        if (event.getChannel().getIdLong() != 1005114534916268032L) return;
        final Message message = event.getMessage();
        message.addReaction("U+1F44D")
                .flatMap(v -> message.addReaction("U+1F44E"))
                .queue();
    }
}
