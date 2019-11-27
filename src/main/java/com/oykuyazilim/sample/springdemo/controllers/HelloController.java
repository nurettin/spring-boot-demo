package com.oykuyazilim.sample.springdemo.controllers;

import com.oykuyazilim.sample.springdemo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/whatTimeIsIt")
    public String whatTimeIsIt() {
        return helloService.getDateAndTime();
    }
}
