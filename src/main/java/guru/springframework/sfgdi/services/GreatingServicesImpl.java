package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreatingServicesImpl implements GreatingService {
    @Override
    public String sayGreating() {
        return "HelloWorld";
    }
}
