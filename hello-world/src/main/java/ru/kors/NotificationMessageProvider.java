package ru.kors;

public class NotificationMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "It's a sunny day";
    }
}
