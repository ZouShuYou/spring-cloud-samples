package com.zsy.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-18 14:54
 */
@Component
public class FallBackService implements UserService{

    @Override
    public String consume(String message) {
        return "调用失败 服务降级";
    }
}
