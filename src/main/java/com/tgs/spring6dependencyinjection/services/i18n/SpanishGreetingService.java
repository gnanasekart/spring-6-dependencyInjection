package com.tgs.spring6dependencyinjection.services.i18n;

import com.tgs.spring6dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(("SP"))
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Spanish";
    }
}
