package com.zsy.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-18 11:10
 */
@FeignClient(value = "provider",  fallback = FallBackService.class)
public interface UserService {

    @GetMapping("provide/{message}")
    public String consume(@PathVariable("message") String message);
}
