package ru.kors;

public class HelloWorldMessageProvider implements MessageProvider{
    public HelloWorldMessageProvider() {
        System.out.println("Init HelloWorldMessageProvider class");
    }

    @Override
    public String getMessage() {
        return "Hello World! From HelloWorldMessageProvider.getMessage()";
    }
}
