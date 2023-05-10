package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greatingService = new GreatingServicesImpl();
    }

    @Test
    void getGreating() {
        System.out.println(controller.getGreating());
    }
}