package kors;

public class SystemOutMessageHandler implements MessageHandler{
    private MessageProvider messageProvider;

    public SystemOutMessageHandler() {
        System.out.println("Init SystemOutMessageHandler class");
    }

    @Override
    public void handling() {
        if (messageProvider == null) throw new RuntimeException(
                "Set message provider"
        );
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
