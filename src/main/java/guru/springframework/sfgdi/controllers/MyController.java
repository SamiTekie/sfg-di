package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreatingService greatingService;

    public MyController(GreatingService greatingService) {
        this.greatingService = greatingService;
    }

    public String sayHello(){


        return greatingService.sayGreating();
    }
}
