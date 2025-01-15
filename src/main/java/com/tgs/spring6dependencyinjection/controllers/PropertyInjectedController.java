package com.tgs.spring6dependencyinjection.controllers;

import com.tgs.spring6dependencyinjection.services.GreetingService;
//Different way of Dependency Injection without Spring
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
