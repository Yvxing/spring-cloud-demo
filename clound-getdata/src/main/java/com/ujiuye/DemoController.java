package com.ujiuye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 这里cloud-server相当于服务中心zookeeper服务中心，cloudclient为注册的项目，服务。    此处cloud-getdata为引用服务的项目
     *测试时这里需要让server启动，注册的项目和要调用的项目在配置eureka.client时server-url的defaultZone都要配置到server的端口上
     * 并指定server端口下的eureka项目  如http://localhost:8088/eureka/
     * 这里选择的是object返回，如果需要对象类型需要定义一个pojo的包装类  在网页中展示的是string  所以这里用了string.class
     *
     *客户端和服务端最好都加上注解  EnableEurekaServer 或 EnableEurekaClient
     * @return
     */
    @RequestMapping("/getObj")
    public Object getResult(){
        return restTemplate.getForObject("http://localhost:8089/all",String.class);
    }

}
