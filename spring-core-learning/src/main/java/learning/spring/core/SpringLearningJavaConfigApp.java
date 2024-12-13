package learning.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLearningJavaConfigApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
        Car car = ctx.getBean(Car.class);
        System.out.println(car.getCarFeature());
    }
}
