package com.avenuecode.personal.baseservice.resource;

import com.avenuecode.personal.baseservice.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping("/base-service/v1")
public interface UserResource {

    @GetMapping("/user/{id}")
    ResponseEntity<User> getUser(@PathVariable Long id);

    @GetMapping("/user")
    ResponseEntity<Set<User>> getUsers();

    @PostMapping("/user")
    ResponseEntity<User> createUser(@RequestBody User user);

    @DeleteMapping("/user/{id}")
    ResponseEntity<String> deleteUser(@PathVariable String id);

    @PutMapping("/user/{id}")
    ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable String id);

}
