package com.tgs.spring6dependencyinjection.session1.controllers.greeting;

import com.tgs.spring6dependencyinjection.session1.services.greeting.GreetingService;
import com.tgs.spring6dependencyinjection.session1.services.greeting.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
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

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
