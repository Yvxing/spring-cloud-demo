package com.ujiuye.controller;

import com.ujiuye.pojo.TbBrand;
import com.ujiuye.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableEurekaClient
public class EurekaController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/all")
    public List<TbBrand> all(){
        return brandService.findAll();
    }

}
