package com.tgs.spring6dependencyinjection.session2.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
        System.out.println("HelloService Constructor called");
    }

    public String greeting() {
        return "Hello from HelloService";
    }
}
