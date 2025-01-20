package com.tgs.spring6dependencyinjection.controllers.greeting.i18n;

import com.tgs.spring6dependencyinjection.services.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
