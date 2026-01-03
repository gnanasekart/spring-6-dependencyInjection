package com.tgs.spring6dependencyinjection.session2.DIExample;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer{

    public void write() {
        System.out.println("Pencil is writing...");
    }
}
