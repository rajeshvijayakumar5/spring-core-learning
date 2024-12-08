package learning.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("learning.spring.core")
public class SpringCoreLearning {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringCoreLearning.class);
        Customer cus = ctx.getBean(Customer.class);
        System.out.println(cus.getMessage());
    }
}