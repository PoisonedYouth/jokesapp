package com.poisonedyouth.jokesapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by matze on 24.05.2018
 */
@Configuration
public class JokesAppConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
