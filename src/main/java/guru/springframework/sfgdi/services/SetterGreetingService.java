package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
