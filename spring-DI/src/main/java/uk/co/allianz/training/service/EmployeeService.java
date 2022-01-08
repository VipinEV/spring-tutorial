package uk.co.allianz.training.service;

import uk.co.allianz.training.model.Employee;

public class EmployeeService {

    public Employee getEmployee() {
        System.out.println("Invoked method");
        return new Employee();
    }
}
