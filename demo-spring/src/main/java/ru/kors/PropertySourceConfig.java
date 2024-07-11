package ru.kors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:message.properties")
public class PropertySourceConfig {
    @Value("${message2:Default message}")
    private String message2;

    @Bean
    @Lazy
    public MessageProvider messageProvider1(Environment environment) {
        return new ConfigurableMessageProvider(environment.getProperty("message1"));
    }

    @Bean
    public MessageProvider messageProvider2(Environment environment) {
        return new ConfigurableMessageProvider(message2);
    }
}
