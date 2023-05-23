package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingService implements GreatingService{
    @Override
    public String sayGreating() {
        return "HelloWorld - Setter";
    }
}
