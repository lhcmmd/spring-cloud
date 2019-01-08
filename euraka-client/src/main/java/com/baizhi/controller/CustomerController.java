package com.baizhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("cc")
public class CustomerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("getPro")
    public String getPro(String name){
        String forObject = restTemplate.getForObject("http://EUREKA-PRODUCTER/pro/pro?name="+name, String.class);
        return forObject;
    }
}
