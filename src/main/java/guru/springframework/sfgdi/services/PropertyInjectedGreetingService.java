package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreatingService{
    @Override
    public String sayGreating() {
        return "HelloWorld - Property";
    }

}
