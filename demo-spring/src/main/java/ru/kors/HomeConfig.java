package ru.kors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("home")
public class HomeConfig {
    @Bean
    public ClothesStrategy clothesStrategy() {
        return new HomeDress();
    }
}
