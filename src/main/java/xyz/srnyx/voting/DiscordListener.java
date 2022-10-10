package xyz.srnyx.voting;

import github.scarsz.discordsrv.api.Subscribe;
import github.scarsz.discordsrv.api.events.DiscordGuildMessageReceivedEvent;
import github.scarsz.discordsrv.dependencies.jda.api.entities.Message;


public class DiscordListener {
    @Subscribe
    public void onGuildMessageReceive(DiscordGuildMessageReceivedEvent event) {
        final Message message = event.getMessage();
        final String channel = event.getChannel().getId();

        if (channel.equals("1005114534916268032")) {
            message.addReaction("U+1F44D").queue();
            message.addReaction("U+1F44E").queue();
        }
    }
}
