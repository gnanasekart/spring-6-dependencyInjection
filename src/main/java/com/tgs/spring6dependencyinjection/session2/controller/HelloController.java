package com.tgs.spring6dependencyinjection.session2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet() {
        return "Hello World!";
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "This is the About Us section of the HelloController.";
    }
}
