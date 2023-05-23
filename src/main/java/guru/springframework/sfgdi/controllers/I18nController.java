package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreatingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreatingService greatingService;

    public I18nController(@Qualifier("I18nService")GreatingService greatingService) {
        this.greatingService = greatingService;
    }
    public String sayHello(){
      return   greatingService.sayGreating();
    }
}
