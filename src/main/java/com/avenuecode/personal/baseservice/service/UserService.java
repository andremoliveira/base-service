package com.avenuecode.personal.baseservice.service;

import com.avenuecode.personal.baseservice.client.DatabaseServiceClient;
import com.avenuecode.personal.baseservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private DatabaseServiceClient databaseServiceClient;

    @Autowired
    public UserService(DatabaseServiceClient databaseServiceClient) {
        this.databaseServiceClient = databaseServiceClient;
    }

    public User getUserById(Long userId) {
        User user = databaseServiceClient.getUserById(userId);
        return user;
    }
}
