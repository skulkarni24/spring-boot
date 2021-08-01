package com.example.demo.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.dao.EmployeeRepo;

@RestController
public class EmployeeDetailsController {

	@Autowired
	EmployeeRepo repo;
	

	@RequestMapping(value="/getEmployeeDetails" , method=RequestMethod.GET)
	public List<Employee> getEmpDetails() {
		List<Employee> emp = new ArrayList<Employee>();
		emp = repo.listEmpDetails();
		return emp;
		
	}	
	
	@RequestMapping(value="/saveEmployeeDetails" , method=RequestMethod.POST)
	public Employee saveEmpDetails(@RequestBody Employee e) {
		Employee emp = new Employee();
		emp = repo.save(e);
		return emp;
		
	}	
	
}
