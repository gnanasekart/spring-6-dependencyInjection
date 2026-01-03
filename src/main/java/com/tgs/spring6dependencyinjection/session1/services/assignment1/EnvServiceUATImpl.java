package com.tgs.spring6dependencyinjection.session1.services.assignment1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class EnvServiceUATImpl implements EnvService {
    @Override
    public String getEnv() {
        return "UAT environment";
    }
}
