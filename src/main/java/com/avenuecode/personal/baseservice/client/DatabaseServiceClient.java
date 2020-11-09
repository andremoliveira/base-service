package com.avenuecode.personal.baseservice.client;

import com.avenuecode.personal.baseservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@FeignClient(value = "database-service", url = "localhost:8080/database-service/v1")
public interface DatabaseServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    User getUserById(@PathVariable("userId") Long userId);

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    Set<User> getAllUsers();

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    User createUser(User user);

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{userId}")
    String deleteUser(@PathVariable("userId") Long id);

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{userId}")
    User updateUser(User user, @PathVariable("userId") Long id);

}
