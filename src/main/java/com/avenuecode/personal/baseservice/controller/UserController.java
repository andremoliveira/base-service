package com.avenuecode.personal.baseservice.controller;

import com.avenuecode.personal.baseservice.model.User;
import com.avenuecode.personal.baseservice.resource.UserResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserResource {

    @Override
    public ResponseEntity<User> getUser(Long id) {
        return new ResponseEntity<>(User.builder().id(1).name("Andre Machado").build(), HttpStatus.OK);
    }
}
