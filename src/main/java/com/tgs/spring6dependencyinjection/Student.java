package com.tgs.spring6dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    //@Autowired
    private Pen pen;//Field Injection

    @Autowired
    @Qualifier("pencil")
    private Writer writer;

//    @Autowired
//    public void setPen(Pen pen) {//Setter Injection
//        System.out.println("Setter Injection called");
//        this.pen = pen;
//    }

//    @Autowired
//    public Student(Pen pen) {
//        System.out.println("Constructor Injection called");
//        this.pen = pen;
//    }

    public Student() {
        System.out.println("Student Object Created");
    }

    public void show() {
        System.out.println("Hello from Student class");
    }

    public void writeExam() {
         System.out.println("Student is writing exam...");
        writer.write();
    }
}
