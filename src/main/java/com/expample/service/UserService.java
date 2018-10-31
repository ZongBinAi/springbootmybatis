package com.expample.service;

import com.expample.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByName(String name) {
        return userMapper.findByName(name);

    }

    public int insert(String name, Integer age) {
        return userMapper.insert(name, age);

    }
}
