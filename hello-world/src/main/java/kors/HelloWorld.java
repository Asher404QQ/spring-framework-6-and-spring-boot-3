package kors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        annotationsBeanHelloWorld();
    }

    private static void xmlBeanConfigHelloWorld() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        MessageHandler messageHandler = ctx.getBean("handler", MessageHandler.class);
        messageHandler.handling();
    }

    private static void annotationsBeanHelloWorld() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        MessageHandler handler = ctx.getBean("messageHandler", MessageHandler.class);
        handler.handling();
    }
    
    private static void defaultHelloWorld() {
        System.out.println("Hello World!");
    }

    private static void modularHelloWorld() {
        MessageHandler messageHandler = new SystemOutMessageHandler();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageHandler.setMessageProvider(messageProvider);
        messageHandler.handling();
    }

    private static void factoryHelloWorld() {
        var handler = MessageFactory.getInstance().getMessageHandler()
                .orElseThrow(() -> new IllegalArgumentException("Message Handler is null"));
        var provider = MessageFactory.getInstance().getMessageProvider()
                .orElseThrow(() -> new IllegalArgumentException("Message Provider is null"));

        handler.setMessageProvider(provider);
        handler.handling();
    }
}