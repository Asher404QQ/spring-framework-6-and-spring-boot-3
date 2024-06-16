package kors;

public interface MessageHandler {
    void handling();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
