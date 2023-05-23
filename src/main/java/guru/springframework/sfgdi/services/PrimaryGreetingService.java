package guru.springframework.sfgdi.services;

public class PrimaryGreetingService implements  GreatingService{
    @Override
    public String sayGreating() {
        return "Hello World - From thePRIMARY Bean";
    }
}
