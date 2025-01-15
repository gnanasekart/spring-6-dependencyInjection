package com.tgs.spring6dependencyinjection.controllers;

import com.tgs.spring6dependencyinjection.services.GreetingService;
import com.tgs.spring6dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

//@Controller
public class MyController {
    //Without DependencyInjection
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String satHello(){
        System.out.println("Hello from MyController");
        return greetingService.sayGreeting();
    }
}
