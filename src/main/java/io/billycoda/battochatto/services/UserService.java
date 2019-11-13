package io.billycoda.battochatto.services;

import io.billycoda.battochatto.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    ResponseEntity<List<User>> getAllUsers();

    ResponseEntity<String> addUser(User user);

    ResponseEntity<User> loginAttempt(User userLoginData);

    ResponseEntity<User> getUserById(String id);

    ResponseEntity<User> getUserByUsername(String name);

    ResponseEntity<String> updateUser(String id, User updatedInfo);

    ResponseEntity<String> deleteUser(String id);
}
