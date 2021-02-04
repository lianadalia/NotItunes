package com.gitlab.lianadalia.task4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "<h1>This is the root page</h1>";

    }
    @GetMapping("/hello")
    public String greetGuest() {
        return "Hello, guest!";
    }

}
