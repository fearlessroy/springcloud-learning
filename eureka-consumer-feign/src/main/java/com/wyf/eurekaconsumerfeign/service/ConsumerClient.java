package com.wyf.eurekaconsumerfeign.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface ConsumerClient {
    @GetMapping("/test")
    String consumer();
}
