package com.tgs.spring6dependencyinjection.controllers;

import com.tgs.spring6dependencyinjection.services.GreetingService;
//Different way of Dependency Injection without Spring
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayhello(){
        return greetingService.sayGreeting();
    }
}
