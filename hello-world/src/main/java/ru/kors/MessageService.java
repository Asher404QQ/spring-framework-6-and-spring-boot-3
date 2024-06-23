package ru.kors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private InMemoryMessageDAO messageDAO;

    public void post() {
        System.out.println(messageDAO.getMessage());
    }
}
