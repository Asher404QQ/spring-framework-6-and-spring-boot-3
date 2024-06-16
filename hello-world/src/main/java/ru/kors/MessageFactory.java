package ru.kors;

import java.util.Optional;
import java.util.Properties;

public class MessageFactory {
    private static MessageFactory instance;
    private MessageHandler messageHandler;
    private MessageProvider messageProvider;
    private Properties props;

    static {
        instance = new MessageFactory();
    }
    private MessageFactory() {
        props = new Properties();
        try {
            props.load(this.getClass().getResourceAsStream("/application.properties"));
            String handlerClass = props.getProperty("handler.class");
            String providerClass = props.getProperty("provider.class");

            messageHandler = (MessageHandler) Class.forName(handlerClass)
                    .getDeclaredConstructor().newInstance();
            messageProvider = (MessageProvider) Class.forName(providerClass)
                    .getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MessageFactory getInstance() {
        return instance;
    }

    public Optional<MessageHandler> getMessageHandler() {
        return messageHandler == null ? Optional.empty() : Optional.of(messageHandler);
    }

    public Optional<MessageProvider> getMessageProvider() {
        return messageProvider == null ? Optional.empty() : Optional.of(messageProvider);
    }
}
