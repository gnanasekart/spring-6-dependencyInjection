package com.tgs.spring6dependencyinjection.controllers.greeting;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void satHello() {
        System.out.println(new MyController().satHello());
    }
}