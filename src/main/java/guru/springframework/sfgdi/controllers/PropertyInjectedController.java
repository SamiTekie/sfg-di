package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreatingService greatingService;
    public String getGreating(){

        return greatingService.sayGreating();
    }
}
