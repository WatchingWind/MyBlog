package com.classmates.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/")
    public String home() {
        return "This is My BlogService Home!";
    }
}
