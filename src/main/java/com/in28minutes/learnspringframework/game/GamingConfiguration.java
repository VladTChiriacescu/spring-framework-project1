package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole game() {
        return new MarioGame();
    }

    @Bean
    @Qualifier("superContra")
    public GamingConsole game2() {
        return new SuperContraGame();
    }

    @Bean
    @Qualifier("pacman")
    public GamingConsole game3() {
        return new PacmanGame();
    }

    @Bean
    @Primary
    public GameRunner gameRunner(@Qualifier("pacman") GamingConsole game) {
        return new GameRunner(game);
    }

    @Bean
    public GameRunner gameRunner2(@Qualifier("superContra") GamingConsole game) {
        return new GameRunner(game);
    }

}
