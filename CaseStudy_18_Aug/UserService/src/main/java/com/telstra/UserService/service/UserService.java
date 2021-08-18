package com.telstra.UserService.service;

import com.telstra.UserService.entity.User;

import java.util.List;

public interface UserService {
  

    User getUserById(long parseLong);

    User addUser(User user);

    String deleteUserById(long parseLong);

    List<User> getAllUsers();

    User updateUser(Long userId, User user);
}
