package com.oykuyazilim.sample.springdemo.controllers;

import com.oykuyazilim.sample.springdemo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

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
