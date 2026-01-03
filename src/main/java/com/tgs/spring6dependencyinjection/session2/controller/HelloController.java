package com.tgs.spring6dependencyinjection.session2.controller;


import com.tgs.spring6dependencyinjection.session2.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService service;

    public  HelloController() {
        System.out.println("HelloController instantiated");
    }

    @GetMapping("/")
    public String greet() {
        return service.greeting();
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "This is the About Us section of the HelloController.";
    }
}
