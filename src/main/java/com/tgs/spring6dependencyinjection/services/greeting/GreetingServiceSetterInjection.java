package com.tgs.spring6dependencyinjection.services.greeting;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{

    @Override
    public String sayGreeting() {
        return "I am setting the greeting";
    }
}
