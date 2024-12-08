package learning.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private final CustomerService customerService;

    @Autowired
    public Customer(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String getMessage() {
        return "Hello " + this.customerService.getName() + ", your age is " + this.customerService.getAge();
    }
}
