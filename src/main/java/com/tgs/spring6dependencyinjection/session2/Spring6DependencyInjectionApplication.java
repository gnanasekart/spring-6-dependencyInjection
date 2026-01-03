package com.tgs.spring6dependencyinjection.session2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DependencyInjectionApplication.class, args);

        //Student student = ctx.getBean(Student.class);

        //System.out.println("Main application");
        //student.show();
        //student.writeExam();
    }

}
