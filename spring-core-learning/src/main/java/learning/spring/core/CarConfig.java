package learning.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Bean
    public Car getCar(Engine engine) {
        return new Car(engine);
    }

    @Bean
    public Engine getEngine() {
        return new Engine();
    }
}
