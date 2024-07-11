package ru.kors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {

    @Bean(initMethod = "beanInitMethod")
    public Author firstAuthor() {
        Author author = new Author();
        return author;
    }

    @Bean(initMethod = "beanInitMethod")
    public Author secondAuthor() {
        Author author = new Author();
        author.setName("Anton");
        return author;
    }

    @Bean(initMethod = "beanInitMethod")
    public Author thirdAuthor() {
        Author author = new Author();
        author.setName("Petr");
        return author;
    }
}
