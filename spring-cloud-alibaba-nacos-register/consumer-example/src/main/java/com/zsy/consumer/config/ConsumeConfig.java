package com.zsy.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-14 10:01
 */
@Configuration
public class ConsumeConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
