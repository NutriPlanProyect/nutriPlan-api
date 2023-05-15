package com.example.nutriplanapi.service;
import com.example.nutriplanapi.model.User;
public interface UserService {
    User createUser(User user);

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

}
