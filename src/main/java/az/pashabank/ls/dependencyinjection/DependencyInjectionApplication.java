package az.pashabank.ls.dependencyinjection;

import az.pashabank.ls.dependencyinjection.model.Car;
import az.pashabank.ls.dependencyinjection.model.Factory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    private static void printBeans(ConfigurableApplicationContext context) {
        Factory factory = (Factory) context.getBean("getFactory");
        Car car = (Car) context.getBean("getCar");

        System.out.println("Factory name: " + factory.getName() + ", " +
                " Car name: " + factory.getCar().getName());

        //OR
        System.out.println("Car name: " + car.getName());
    }

    public static void main(String[] args) {
        DependencyInjectionApplication.printBeans(SpringApplication.run(DependencyInjectionApplication.class));
    }
}
