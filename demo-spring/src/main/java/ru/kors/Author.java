package ru.kors;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;

public class Author implements InitializingBean {
    private static final String DEFAULT_NAME = "No name";
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("Init bean ru.kors.Author");
        if (name == null) {
            name = DEFAULT_NAME;
        }
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy bean ru.kors.Author");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void beanInitMethod() {
        System.out.println("Init beanInitMethod");
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init afterPropertiesSet");
    }
}
