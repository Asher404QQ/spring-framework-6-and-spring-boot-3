package ru.kors;

import org.springframework.stereotype.Component;

@Component("helloProvider")
public class HelloWorldMessageProvider implements MessageProvider{
    public HelloWorldMessageProvider() {
        System.out.println("Init HelloWorldMessageProvider class");
    }

    @Override
    public String getMessage() {
        return "Hello World! From HelloWorldMessageProvider.getMessage()";
    }
}
