package com.otel.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {

    @GetMapping("/sayHello")
    public String display(){
        return "Hello Otel";
    }
}
