package guru.springframework.sfgdi.services;

public class ConstructorGreetingService implements GreatingService {
    @Override
    public String sayGreating() {
        return "HelloWorld - Constructor";
    }
}
