package org.example.service;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() { return userMapper.findAll(); }
    public User findById(Long id) { return userMapper.findById(id); }
    public int insert(User user) { return userMapper.insert(user); }
    public int deleteById(Long id) { return userMapper.deleteById(id); }
}