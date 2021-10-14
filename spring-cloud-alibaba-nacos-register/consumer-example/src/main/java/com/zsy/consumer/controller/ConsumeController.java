package com.zsy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-14 9:53
 */
@RestController
public class ConsumeController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consume/{message}")
    public String consume(@PathVariable String message){
        String s = restTemplate.getForObject("http://127.0.0.1:8443/provide/"+message,String.class);
        return s;
    }
}
