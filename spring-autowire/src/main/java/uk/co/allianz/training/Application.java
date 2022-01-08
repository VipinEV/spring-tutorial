package uk.co.allianz.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uk.co.allianz.training.controller.EmployeeController;

public class Application {

    public static void main(String[] args) {

        // Vehicle implementation is provided by IOC
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Autowire Injection
        var employeeController = (EmployeeController) context.getBean("employeeController");
        employeeController.getEmployeeDetails();



    }
}
