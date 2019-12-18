package com.puguh.service.authjwtservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class AuthjwtserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthjwtserviceApplication.class, args);
	}

}
