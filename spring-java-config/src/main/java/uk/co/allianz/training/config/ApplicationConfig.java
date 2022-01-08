package uk.co.allianz.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.co.allianz.training.controller.EmployeeController;
import uk.co.allianz.training.service.EmployeeService;

@Configuration
public class ApplicationConfig {

    @Bean
    public uk.co.allianz.training.service.EmployeeService employeeService() {
        return new EmployeeService();
    }

    @Bean
    public uk.co.allianz.training.controller.EmployeeController employeeController() {
        return new EmployeeController();
    }

}
