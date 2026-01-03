package com.tgs.spring6dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer{

    public void write() {
        System.out.println("Pencil is writing...");
    }
}
