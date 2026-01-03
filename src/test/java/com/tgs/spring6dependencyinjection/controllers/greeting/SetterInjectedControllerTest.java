package com.tgs.spring6dependencyinjection.controllers.greeting;

import com.tgs.spring6dependencyinjection.session1.controllers.greeting.SetterInjectedController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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