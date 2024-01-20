package com.taskmanager.service;

import com.taskmanager.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    List<User> getAll();
}