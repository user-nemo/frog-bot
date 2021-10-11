package de.usernemo.frogbot.configuration;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import javax.security.auth.login.LoginException;

@Configuration
public class FrogBotConfiguration {
    @Autowired
    FrogBotProperties properties;

    @Bean
    public JDA jda() throws LoginException, InterruptedException {
        return JDABuilder.createDefault(properties.getKey())
            .build();
    }
}
