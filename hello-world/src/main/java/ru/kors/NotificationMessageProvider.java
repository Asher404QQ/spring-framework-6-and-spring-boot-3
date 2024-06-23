package ru.kors;

import org.springframework.stereotype.Component;

@Component("notificationProvider")
public class NotificationMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "It's a sunny day";
    }
}
