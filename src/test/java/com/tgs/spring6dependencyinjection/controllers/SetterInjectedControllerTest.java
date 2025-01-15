package com.tgs.spring6dependencyinjection.controllers;

import com.tgs.spring6dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller;

    //Commented out for using Spring
//    @BeforeEach
//    void setUp() {
//        controller = new SetterInjectedController();
//        controller.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayhello() {
        System.out.println(controller.sayhello());
    }
}