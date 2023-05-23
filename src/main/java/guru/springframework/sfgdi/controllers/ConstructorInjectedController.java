package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class ConstructorInjectedController {
    private final GreatingService greatingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreatingService greatingService) {
        this.greatingService = greatingService;
    }

    public String getGreating(){

        return greatingService.sayGreating();
    }
}
