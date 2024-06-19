package com.test.spring_jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingControler {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

}
