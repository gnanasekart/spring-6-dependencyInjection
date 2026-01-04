package com.tgs.spring6dependencyinjection.sessionJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6JPAApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6JPAApplication.class, args);

    }

}
