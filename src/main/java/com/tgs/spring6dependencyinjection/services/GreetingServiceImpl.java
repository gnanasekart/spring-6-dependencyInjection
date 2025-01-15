package com.tgs.spring6dependencyinjection.services;
//Without DependencyInjection
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Base Services";
    }
}
