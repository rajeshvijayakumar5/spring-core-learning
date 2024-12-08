package learning.spring.core;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    public String getName() {
        return "Rajesh";
    }

    public int getAge() {
        return 30;
    }
}
