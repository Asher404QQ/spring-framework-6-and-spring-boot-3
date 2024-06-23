package ru.kors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("authorConfig")
public class AuthorConfig {
    private final String username = "Korsakov";
    private final String password = "123456789";
    private final int age = 33;
    private final String email = "myemail@gmail.com";
    private final Double balance = 99999999.99;
    private final boolean isActive = false;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }
}
