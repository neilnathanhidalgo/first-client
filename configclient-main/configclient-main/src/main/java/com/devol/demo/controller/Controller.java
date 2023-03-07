package com.devol.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${client.status}")
    private String status;
    @Value("${answer.feign}")
    private String feignAnswer;

    @GetMapping("/status")
    public String status() {
        return status;
    }

    @GetMapping("/feign-llamada")
    public String llamada() {
        return feignAnswer;
    }
}
