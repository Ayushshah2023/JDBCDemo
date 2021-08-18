package com.telstra.UserService.service;

import com.telstra.UserService.entity.User;
import com.telstra.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public String deleteUserById(long userId) {
        userRepository.deleteById(userId);
        return "User Deleted !!";
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long userId, User user) {

        User userdb = userRepository.findById(userId).get();

        if(Objects.nonNull(user.getUsername()) &&
                !"".equalsIgnoreCase(user.getUsername())){
            userdb.setUsername(user.getUsername());
        }

        return userRepository.save(userdb);

    }
}
