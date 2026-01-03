package com.tgs.spring6dependencyinjection.session1;

import com.tgs.spring6dependencyinjection.session1.controllers.greeting.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DependencyInjectionApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

    }

}
