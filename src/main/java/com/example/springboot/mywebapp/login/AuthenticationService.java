package com.example.springboot.mywebapp.login;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthenticationService {
    public AuthenticationService(){
    }

    public boolean authenticate(String name, String password){
        return Objects.equals(name, "kfozla") && Objects.equals(password, "123");
    }
}
