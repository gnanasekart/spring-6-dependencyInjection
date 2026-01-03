package com.tgs.spring6dependencyinjection.session1.controllers.greeting.i18n;

import com.tgs.spring6dependencyinjection.session1.services.greeting.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class Myi18NController {

    private final GreetingService greetingService;
    //@Qualifier("i18nService")
    public Myi18NController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
