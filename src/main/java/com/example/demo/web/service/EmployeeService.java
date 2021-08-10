package com.example.demo.web.service;

import java.util.List;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.dto.EmployDto;

public interface EmployeeService {

public List<EmployDto> listEmpDetails();	
	
public Employee saveEmployeeDetails(Employee emp);

public List<Employee> fetchEmployeeDetails(String empname);
}
