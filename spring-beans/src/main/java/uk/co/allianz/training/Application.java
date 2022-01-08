package uk.co.allianz.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uk.co.allianz.training.model.Vehicle;

public class Application {

    public static void main(String[] args) {

        // Vehicle implementation is provided by IOC
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        vehicle.speed();

        // Scope Singleton
        Vehicle vehicle2 = (Vehicle) context.getBean("vehicle");
        Vehicle vehicle3 = (Vehicle) context.getBean("vehicle");
        Vehicle vehicle4 = (Vehicle) context.getBean("vehicle");

        System.out.println(vehicle2 == vehicle3);
        System.out.println(vehicle2 == vehicle4);
        System.out.println(vehicle == vehicle3);


    }
}
