package uk.co.allianz.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uk.co.allianz.training.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void getEmployeeDetails() {
        employeeService.getEmployee();
    }

}
