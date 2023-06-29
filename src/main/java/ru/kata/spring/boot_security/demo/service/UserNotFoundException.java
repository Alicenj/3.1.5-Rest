package ru.kata.spring.boot_security.demo.service;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String massage) {
        super(massage);
    }
}
