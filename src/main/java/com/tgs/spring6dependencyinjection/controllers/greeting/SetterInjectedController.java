package com.tgs.spring6dependencyinjection.controllers.greeting;

import com.tgs.spring6dependencyinjection.services.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
//Different way of Dependency Injection without Spring

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Setting greeting service");
        this.greetingService = greetingService;
    }

    public String sayhello(){
        System.out.println("From SetterInjectedController");
        return greetingService.sayGreeting();
    }
}
