package ru.kors;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("systemHandler")
public class SystemOutMessageHandler implements MessageHandler{
    private MessageProvider messageProvider;

    public SystemOutMessageHandler() {
        System.out.println("Init SystemOutMessageHandler class");
    }

    public SystemOutMessageHandler(MessageProvider messageProvider) {
        System.out.println("================ Constructor-based injection ================");
        System.out.println("Hello from SystemOutMessageHandler(MessageProvider messageProvider)");
        this.messageProvider = messageProvider;
    }

    @Override
    public void handling() {
        if (messageProvider == null) throw new RuntimeException(
                "Set message provider"
        );
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Resource(name = "notificationProvider")
    public void setMessageProvider(MessageProvider messageProvider) {
        System.out.println("================ Setter-based injection ================");
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
