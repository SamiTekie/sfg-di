package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreatingServicesImpl());
    }

    @Test
    void getGreating() {
        System.out.println(controller.getGreating());
    }
}