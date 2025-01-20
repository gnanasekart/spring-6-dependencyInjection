package com.tgs.spring6dependencyinjection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("SP")
@SpringBootTest
public class myi18NControllerTestSP {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void satHello() {
        System.out.println(myi18NController.sayHello());
    }
}
