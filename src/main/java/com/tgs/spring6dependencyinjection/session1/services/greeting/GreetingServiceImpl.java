package com.tgs.spring6dependencyinjection.session1.services.greeting;
//Without DependencyInjection

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Base Services";
    }
}
