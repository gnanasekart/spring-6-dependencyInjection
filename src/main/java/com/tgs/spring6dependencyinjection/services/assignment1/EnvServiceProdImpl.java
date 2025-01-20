package com.tgs.spring6dependencyinjection.services.assignment1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service
public class EnvServiceProdImpl implements EnvService {
    @Override
    public String getEnv() {
        return "Prod environment";
    }
}
