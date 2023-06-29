package ru.kata.spring.boot_security.demo.service;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String massage) {
        super(massage);
    }
}
