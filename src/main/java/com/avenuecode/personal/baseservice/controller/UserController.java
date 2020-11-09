package com.avenuecode.personal.baseservice.controller;

import com.avenuecode.personal.baseservice.model.User;
import com.avenuecode.personal.baseservice.resource.UserResource;
import com.avenuecode.personal.baseservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserResource {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<User> getUser(Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        return new ResponseEntity<>(User.builder().id(1l).name(user.getName()).build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteUser(String id) {
        return new ResponseEntity<>("User deleted successfully.", HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<User> updateUser(User user, String id) {
        return new ResponseEntity<>(User.builder().id(Long.parseLong(id)).name(user.getName()).build(), HttpStatus.OK);
    }
}
