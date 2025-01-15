package com.tgs.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void satHello() {
        System.out.println(new MyController().satHello());
    }
}