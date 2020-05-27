package com.poc.couchbase.controller;

import com.poc.couchbase.model.Employee;
import com.poc.couchbase.model.EmployeeRequest;
import com.poc.couchbase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class TestController {

  @Autowired private EmployeeService employeeService;

  @GetMapping(value = "/employee/{employeeName}")
  public List<Employee> findByCompanyName(@PathVariable String employeeName) {

    return employeeService.findByCompanyName(employeeName);
  }

  @PostMapping(value = "/employee")
  public void addEmployee(@RequestBody EmployeeRequest employeeRequest) {

    employeeService.addEmployee(employeeRequest);
  }
}
