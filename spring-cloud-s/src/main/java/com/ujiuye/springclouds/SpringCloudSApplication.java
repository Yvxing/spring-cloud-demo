package com.ujiuye.springclouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudSApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSApplication.class, args);
    }

}
