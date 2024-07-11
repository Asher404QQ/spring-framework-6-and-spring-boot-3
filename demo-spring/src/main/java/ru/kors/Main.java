package ru.kors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var profile = System.getProperty("spring.profiles.active");
        var ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles(profile);
        ctx.register(HomeConfig.class, EventConfig.class);
        ctx.refresh();

        var clothesStrategy = ctx.getBean(ClothesStrategy.class);
        var clothesList = clothesStrategy.getClothes();
        clothesList.forEach(System.out::println);
    }
}