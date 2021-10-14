package com.zsy.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-14 9:58
 */
@RestController
public class ProvideController {

    @GetMapping("provide/{message}")
    public String consume(@PathVariable String message){
        return "hello nacos " + message;
    }
}
