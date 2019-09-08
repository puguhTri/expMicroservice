package com.puguh.service.userservice.services;

import com.puguh.service.userservice.entities.User;
import com.puguh.service.userservice.kafkaConfig.Publisher;
import com.puguh.service.userservice.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Value("${spring.kafka.topic.userCreated}")
    private static String USER_CREATED_TOPIC;


    @Autowired
    UserRepo userRepo;

    Publisher publisher;

    @Override
    public User registerUser(User input) {
        User user = userRepo.save(input);

        publisher.send(USER_CREATED_TOPIC, input);

        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
