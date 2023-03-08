package com.softj.divesfree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
    @GetMapping("/api")
    public String api(){
        return "hi";
    }
}
