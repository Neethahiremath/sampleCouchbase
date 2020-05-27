package com.poc.couchbase.service;

import com.poc.couchbase.model.Employee;
import com.poc.couchbase.model.EmployeeRequest;
import com.poc.couchbase.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

  @Autowired private EmployeeRepository employeeRepository;

  public List<Employee> findByCompanyName(String companyName) {
    return employeeRepository.findByCompanyName(companyName);
  }

  public void addEmployee(EmployeeRequest employeeRequest) {
    employeeRepository.save(
        Employee.builder()
            .id(employeeRequest.getId())
            .name(employeeRequest.getName())
            .companyName(employeeRequest.getCompanyName())
            .build());
  }

  public Long countEmployee(String companyName) {
    return employeeRepository.countEmployee(companyName);
  }
}
