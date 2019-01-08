package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//可支持zookeeper为注册中心(比较通用)
@EnableDiscoveryClient
//只可支持Eureka为注册中心
//@EnableEurekaServer
@SpringBootApplication
public class EurakaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaServerApplication.class, args);
    }

}

