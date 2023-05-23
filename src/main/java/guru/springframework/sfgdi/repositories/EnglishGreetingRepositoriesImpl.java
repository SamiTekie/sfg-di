package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoriesImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World-EN";
    }
}
