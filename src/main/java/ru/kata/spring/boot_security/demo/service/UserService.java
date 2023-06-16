package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    Optional<User> getUserByEmail(String username);
    void updateUser(Long id, User user);
    void removeUser(Long id);
}
