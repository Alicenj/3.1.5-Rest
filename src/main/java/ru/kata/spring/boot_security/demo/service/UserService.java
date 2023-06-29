package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService  {
    User saveUser(User user) throws UserAlreadyExistsException;
    List<User> getAllUsers();
    User getUserById(Long id);
    Optional<User> getUserByEmail(String username);
    User updateUser(Long id, User user) throws UserNotFoundException, UserAlreadyExistsException;
    User removeUser(Long id);
}
