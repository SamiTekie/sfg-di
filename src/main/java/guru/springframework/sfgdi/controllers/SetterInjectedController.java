package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreatingService greatingService;
@Autowired
    public void setGreatingService(GreatingService greatingService) {
        this.greatingService = greatingService;
    }

    public String getGreating(){

        return greatingService.sayGreating();
    }
}
