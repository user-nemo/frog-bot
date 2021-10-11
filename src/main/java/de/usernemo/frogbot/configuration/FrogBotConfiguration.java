package de.usernemo.frogbot.configuration;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import javax.security.auth.login.LoginException;

@Configuration
public class FrogBotConfiguration {
    @Bean
    public JDA jda() throws LoginException, InterruptedException {
        return JDABuilder.createDefault("ODk3MTU4NjI5MjQ4MTA2NTU3.YWRmFQ.a4yiO-8Hd6uq1LqBQjUUUPP6gTc")
            .build();
    }
}
