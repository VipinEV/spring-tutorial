package uk.co.allianz.training.service;

import uk.co.allianz.training.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployee(Integer empId) {
        return Employee.builder().id(empId).name("Test").age(28).build();
    }
}
