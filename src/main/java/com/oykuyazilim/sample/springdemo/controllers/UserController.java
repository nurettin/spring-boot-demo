package com.oykuyazilim.sample.springdemo.controllers;

import com.oykuyazilim.sample.springdemo.entities.User;
import com.oykuyazilim.sample.springdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/create")
    public User create() {
        User user = new User();
        user.setUsername("mario");
        return userRepository.save(user);
    }

    @GetMapping("/list")
    public List<User> list() {
        return userRepository.findAll();
    }
}
