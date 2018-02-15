package com.wyf.eurekaconsumerfeign.controller;


import com.wyf.eurekaconsumerfeign.service.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerClient consumerClient;

    @GetMapping("/consumer")
    public String test(){
        return consumerClient.consumer();
    }
}
