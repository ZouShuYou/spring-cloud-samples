package com.zsy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-25 13:53
 */
@EnableDiscoveryClient
@SpringBootApplication

public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
    }
}
