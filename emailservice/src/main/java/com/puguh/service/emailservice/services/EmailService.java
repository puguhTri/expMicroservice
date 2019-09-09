package com.puguh.service.emailservice.services;

import com.puguh.service.emailservice.entities.dto.UserDto;

public interface EmailService {

    void sendSimpleMessage(UserDto input);

}
