package com.ujiuye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CloundGetdataApplication {

    /**
     * 发现eureka中的服务(zookeeper中注册的是服务的接口，eureka注册的是一个项目)
     * 发现服务的方式（restTemplate和Feign）底层都是通过httpclient来调用服务的
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CloundGetdataApplication.class, args);
    }


    @Bean
    public RestTemplate initRestTemplate(){
        return new RestTemplate();
    }

}
