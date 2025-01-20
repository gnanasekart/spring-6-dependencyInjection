package com.tgs.spring6dependencyinjection.controllers.assignment1;

import com.tgs.spring6dependencyinjection.services.assignment1.EnvService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvController {

    private final EnvService service;

    public EnvController(EnvService service) {
        this.service = service;
    }

    public String getEnvironment() {
        return "you are in "+service.getEnv();
    }

}
