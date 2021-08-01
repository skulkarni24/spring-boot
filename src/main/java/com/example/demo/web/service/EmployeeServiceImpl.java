package com.example.demo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.dao.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	EmployeeRepo repo;
	
	
	@Override
	public List<Employee> listEmpDetails() {
		return repo.listEmpDetails();
	}

	@Override
	public Employee saveEmployeeDetails(Employee emp) {
		
		return repo.save(emp);
	}

}
