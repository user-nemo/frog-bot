package de.usernemo.frogbot.bot.listener;

import net.dv8tion.jda.api.JDA;

public abstract class AbstractEventHandle {
    public AbstractEventHandle(JDA jda) throws InterruptedException {
        jda.awaitReady()
            .addEventListener(this);
    }
}