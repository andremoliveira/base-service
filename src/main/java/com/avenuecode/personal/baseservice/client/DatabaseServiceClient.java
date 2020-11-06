package com.avenuecode.personal.baseservice.client;

import com.avenuecode.personal.baseservice.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(value = "database-service", url = "localhost:8080/database-service/v1")
public interface DatabaseServiceClient {

//    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    User getUserById(@PathVariable("userId") Long userId);

}
