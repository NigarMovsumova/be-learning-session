package az.pashabank.ls.dependencyinjection.config;

import az.pashabank.ls.dependencyinjection.model.Car;
import az.pashabank.ls.dependencyinjection.model.Factory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public Car getCar() {
        return new Car("BMW");
    }

    @Bean
    public Factory getFactory(Car car) {
        return new Factory("Car Factory", car);
    }
}
