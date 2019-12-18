package com.puguh.service.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@ComponentScan({"com.puguh.service.commonservice"})
public class GatewayserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayserviceApplication.class, args);
    }

}
