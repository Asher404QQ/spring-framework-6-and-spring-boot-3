package ru.kors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.concurrent.CopyOnWriteArrayList;

@Repository
@Scope("prototype")
public class InMemoryMessageDAO {
    private String message = "https://t.me/korsakov_tech";
    private final CopyOnWriteArrayList<String> messages = new CopyOnWriteArrayList<>();

    public void addMessage(String message) {
        messages.add(message);
    }

    public CopyOnWriteArrayList<String> getMessages() {
        return messages;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
