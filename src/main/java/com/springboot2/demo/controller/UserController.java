package com.springboot2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Dummy controller to make Spring Listening on port 8080,
// otherwise it exists.
@RestController
public class UserController {

    @GetMapping("/users")
    public String user() {
        return "users";
    }
}
