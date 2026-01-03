package com.tgs.spring6dependencyinjection.session1.controllers.greeting;

import com.tgs.spring6dependencyinjection.session1.services.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
//Different way of Dependency Injection without Spring

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        System.out.println("From PropertyInjectedController");
        return greetingService.sayGreeting();
    }
}
