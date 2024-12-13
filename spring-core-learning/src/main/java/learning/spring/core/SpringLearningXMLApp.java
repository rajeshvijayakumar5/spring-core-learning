package learning.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningXMLApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("MyApp.xml");
        Customer cus = ctx.getBean(Customer.class);
        System.out.println(cus.getMessage());
    }
}
