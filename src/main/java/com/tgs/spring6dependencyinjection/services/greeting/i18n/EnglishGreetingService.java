package com.tgs.spring6dependencyinjection.services.greeting.i18n;

import com.tgs.spring6dependencyinjection.services.greeting.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN")
@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - English";
    }
}
