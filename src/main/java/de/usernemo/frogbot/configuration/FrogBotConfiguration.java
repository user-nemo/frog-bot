package de.usernemo.frogbot.configuration;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.AnnotatedEventManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.security.auth.login.LoginException;

@Configuration
public class FrogBotConfiguration {
    @Autowired
    FrogBotProperties properties;

    @Bean
    public JDA jda() throws LoginException {
        return JDABuilder.createDefault(properties.getKey())
            .setEventManager(new AnnotatedEventManager())
            .build();
    }
}
