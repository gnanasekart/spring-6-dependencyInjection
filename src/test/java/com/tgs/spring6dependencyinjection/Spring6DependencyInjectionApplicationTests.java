package com.tgs.spring6dependencyinjection;

import com.tgs.spring6dependencyinjection.controllers.greeting.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DependencyInjectionApplicationTests {

    @Autowired  // injecting ApplicationContext into the test class
    private ApplicationContext applicationContext;

    @Autowired
    private MyController myController;

    @Test
    void testDependencyInjectionByGettingControllerViaCtx() {
        MyController controller = applicationContext.getBean(MyController.class);
        controller.satHello();
    }

    @Test
    void testDependencyInjectionByGettingControllerViaAutowired() {
        myController.satHello();
    }

    @Test
    void contextLoads() {
    }

}
