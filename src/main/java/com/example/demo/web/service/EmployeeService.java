package com.example.demo.web.service;

import java.util.List;

import com.example.demo.web.dao.Employee;

public interface EmployeeService {

public List<Employee> listEmpDetails();	
	
public Employee saveEmployeeDetails(Employee emp);
}
