package uk.co.allianz.training.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.co.allianz.training.model.Employee;
import uk.co.allianz.training.service.EmployeeService;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employee/{id}", headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<Employee> getEmployee(@PathVariable("id") final Integer empId) {
        return new ResponseEntity<>(employeeService.getEmployee(empId), HttpStatus.OK);
    }


}
