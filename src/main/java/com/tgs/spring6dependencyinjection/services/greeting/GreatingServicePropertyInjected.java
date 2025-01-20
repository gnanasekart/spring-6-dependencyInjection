package com.tgs.spring6dependencyinjection.services.greeting;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreatingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let to use property Injections";
    }
}
