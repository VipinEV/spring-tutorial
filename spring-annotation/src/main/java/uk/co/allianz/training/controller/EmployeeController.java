package uk.co.allianz.training.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import uk.co.allianz.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeController {

    @Autowired
    @Qualifier("employeeService")
    private EmployeeService employeeServiceBean;

    public void getEmployeeDetails() {
        employeeServiceBean.getEmployee();
    }

//    @Autowired
//    public void setEmployeeService(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

}
