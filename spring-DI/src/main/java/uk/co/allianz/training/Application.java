package uk.co.allianz.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uk.co.allianz.training.controller.EmployeeController;
import uk.co.allianz.training.controller.SetterController;
import uk.co.allianz.training.model.Vehicle;

public class Application {

    public static void main(String[] args) {

        // Vehicle implementation is provided by IOC
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Constructor Injection
        var employeeController = (EmployeeController) context.getBean("employeeController");
        employeeController.getEmployeeDetails();

        // Setter Injection
        var setterController = (SetterController) context.getBean("setterEmployee");
        setterController.getEmployee();



    }
}
