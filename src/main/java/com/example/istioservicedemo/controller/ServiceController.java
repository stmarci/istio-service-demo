package com.example.istioservicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/demo")
    public String demoEndpoint() {
        return "This is a demo endpoint.";
    }

}