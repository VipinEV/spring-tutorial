package uk.co.allianz.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uk.co.allianz.training.config.ApplicationConfig;
import uk.co.allianz.training.controller.EmployeeController;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        var controller = applicationContext.getBean(EmployeeController.class);
        controller.getEmployeeDetails();

    }
}
