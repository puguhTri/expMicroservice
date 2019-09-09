package com.puguh.service.emailservice.services;

import com.puguh.service.emailservice.entities.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    JavaMailSender javaMailSender;


    @Override
    public void sendSimpleMessage(UserDto input) {
        try {


            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(input.getUsername());
            message.setSubject("test microservices");
            message.setText("Microservices consume kafka from topic");


            System.out.println("Mail TO ::: " + input.getUsername());

            javaMailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }
    }
}
