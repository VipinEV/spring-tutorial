package uk.co.allianz.training.service;

import org.springframework.stereotype.Service;
import uk.co.allianz.training.model.Employee;

@Service
public class EmployeeService {

    public Employee getEmployee() {
        System.out.println("Invoked method");
        return new Employee();
    }
}
