package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreatingService greatingService;
@Autowired
    public String getGreating(){

        return greatingService.sayGreating();
    }
}
