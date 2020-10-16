package com.avenuecode.personal.baseservice.resource;

import com.avenuecode.personal.baseservice.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/base-service/v1")
public interface UserResource {

    @GetMapping("/user/{id}")
    ResponseEntity<User> getUser(@PathVariable Long id);
}
