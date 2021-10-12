package de.usernemo.frogbot.bot.listener;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageEventHandle extends AbstractEventHandle {
    @Autowired
    public MessageEventHandle(JDA jda) throws InterruptedException {
        super(jda);
    }

    @SubscribeEvent
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().toUpperCase().contains("BTS")) {
            event.getMessage()
                .delete()
                .queue();
            event.getTextChannel()
                .sendMessage("I prohibit thy ribbit!")
                .queue();
        }
    }
}
