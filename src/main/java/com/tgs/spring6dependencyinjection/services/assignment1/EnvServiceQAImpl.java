package com.tgs.spring6dependencyinjection.services.assignment1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class EnvServiceQAImpl implements EnvService {
    @Override
    public String getEnv() {
        return "QA environment";
    }
}
