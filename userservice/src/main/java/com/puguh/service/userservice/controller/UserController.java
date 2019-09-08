package com.puguh.service.userservice.controller;


import com.puguh.service.userservice.entities.User;
import com.puguh.service.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/member")
    public ResponseEntity<List<User>> getAll() {
        List<User> userList = userService.findAll();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/member")
    public ResponseEntity<User> register(@RequestBody User user) {
        User data = userService.registerUser(user);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
