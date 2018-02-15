package com.wyf.eurekaconsumerribbon.controller;


import com.wyf.eurekaconsumerribbon.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    ConsumerService consumerService;


    @GetMapping("/consumer")
    public String test() {
//        return restTemplate.getForObject("http://eureka-client/test", String.class);
        return consumerService.consumer();
    }

}
