package com.tgs.spring6dependencyinjection.controllers;

import com.tgs.spring6dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
//Different way of Dependency Injection without Spring

//@Component
//public class ConstructorInjectedController {
//
//    @Autowired
//    private final GreetingService greetingService;
//
//    public ConstructorInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

//-----------------Qualifier --------------------------------

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        System.out.println("From ConstructorInjectedController");
        return greetingService.sayGreeting();
    }
}
