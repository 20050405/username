package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() { return userService.findAll(); }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) { return userService.findById(id); }

    @PostMapping
    public int insert(@RequestBody User user) { return userService.insert(user); }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) { return userService.deleteById(id); }
}