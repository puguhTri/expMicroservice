package com.puguh.service.commonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommonserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonserviceApplication.class, args);
    }

}
