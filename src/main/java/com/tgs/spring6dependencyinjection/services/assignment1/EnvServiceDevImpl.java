package com.tgs.spring6dependencyinjection.services.assignment1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvServiceDevImpl implements EnvService {
    @Override
    public String getEnv() {
        return "dev environment";
    }
}
