package com.tgs.spring6dependencyinjection.controllers.assignment1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("UAT")
@SpringBootTest
class EnvControllerTest {

    @Autowired
    EnvController testController;

    @Test
    void getEnv(){
        System.out.println(testController.getEnvironment());
    }
}
