package com.bookstore.newbookstore.controllers;

import com.bookstore.newbookstore.model.User;
import com.bookstore.newbookstore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class UserController2 {

    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {

        System.out.println("getting user");

        return userService.getUserList();
    }

    @GetMapping("/current_user")
    public String getCurrentUser(Principal principal) {

        System.out.println("current user");

        return principal.getName();
    }
}
