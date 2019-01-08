package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pro")
public class ProController {

    @RequestMapping("pro")
    public String test(String name){
        return "hello: node1:"+name;
    }
}
