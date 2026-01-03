package com.tgs.spring6dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer {

    public Pen() {
        System.out.println("Pen Object Created");
    }
    public void write() {
        System.out.println("Pen is writing...");
    }
}
