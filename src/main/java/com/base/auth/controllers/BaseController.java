package com.base.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BaseController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
