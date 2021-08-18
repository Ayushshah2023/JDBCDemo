package com.telstra.UserService.controller;
import com.telstra.UserService.entity.User;
import com.telstra.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome!!";
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return this.userService.getUserById(userId);
    }

    @DeleteMapping("/user/{userId}")
    public String deleteUserById(@PathVariable("userId") Long userId){
        return this.userService.deleteUserById(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable("userId") Long userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

}