package ru.kors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("event")
public class EventConfig {
    @Bean
    public ClothesStrategy clothesStrategy() {
        return new EveningDress();
    }
}
