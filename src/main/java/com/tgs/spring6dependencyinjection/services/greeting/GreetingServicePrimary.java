package com.tgs.spring6dependencyinjection.services.greeting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from "+this.getClass().getSimpleName()+" Bean!";
    }
}
