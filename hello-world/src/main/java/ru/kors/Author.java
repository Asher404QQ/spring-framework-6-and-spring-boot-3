package ru.kors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {
    @Value("#{authorConfig.username}")
    private String username;
    @Value("#{authorConfig.password}")
    private String password;
    @Value("#{authorConfig.age}")
    private int age;
    @Value("#{authorConfig.email}")
    private String email;
    @Value("#{authorConfig.balance}")
    private Double balance;
    @Value("#{authorConfig.isActive()}")
    private boolean isActive;
    private Role role;

    @Autowired
    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return """
                Username: %s
                Password: %s
                Age: %d
                Email: %s
                Balance: %.2f
                Is active: %b
                """.formatted(username, password, age,
                email, balance, isActive);
    }
}
