package com.puguh.service.userservice.services;

import com.puguh.service.userservice.entities.User;

import java.util.List;

public interface UserService {

    User registerUser(User input);

    List<User> findAll();
}
