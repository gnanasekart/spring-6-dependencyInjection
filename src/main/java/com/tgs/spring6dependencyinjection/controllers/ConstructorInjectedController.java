package com.tgs.spring6dependencyinjection.controllers;

import com.tgs.spring6dependencyinjection.services.GreetingService;
//Different way of Dependency Injection without Spring
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
