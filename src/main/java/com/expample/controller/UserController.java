package com.expample.controller;

import com.expample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private String name = "wade";
    private Integer age = 38;
    @RequestMapping("/insert")
    public String insert() {
        userService.insert(name, age);
        return "success";
    }

    @RequestMapping("/findByName")
    public User findByName() {
        return userService.findByName("james");
    }

}
