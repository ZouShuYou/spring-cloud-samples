package com.zsy.feign.controller;

import com.zsy.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-18 14:27
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("provide/{message}")
    public String consume(@PathVariable String message){
        return userService.consume(message);
    }
}
