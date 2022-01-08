package uk.co.allianz.training.controller;

import uk.co.allianz.training.model.Employee;
import uk.co.allianz.training.service.EmployeeService;

public class SetterController {

    private EmployeeService employeeService;

    public Employee getEmployee() {
        return employeeService.getEmployee();
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

}
