package com.example.SpringBootRestful.controller;

import com.example.SpringBootRestful.entity.User;
import com.example.SpringBootRestful.exception.BusinessException;
import com.example.SpringBootRestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Todo:此处写注解

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity getAllUser() {
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity updateUserById(@PathVariable int userId, @RequestBody User user) throws BusinessException {
        userService.updateUserById(userId, user);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity deleteUserById(@PathVariable int userId) throws BusinessException {
        userService.deleteUserById(userId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
