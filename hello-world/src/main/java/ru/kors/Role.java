package ru.kors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("role")
public class Role {
    @Value("ADMIN")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}
