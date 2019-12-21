package com.ujiuye.springclound;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient         //服务客户端
@RestController
public class SpringCloundApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloundApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/client1")
    public String test(){
        return "hello spring cloud This port is :"+port;
    }

}
