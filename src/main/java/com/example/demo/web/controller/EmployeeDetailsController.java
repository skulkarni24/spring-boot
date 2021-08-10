package com.example.demo.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.dao.EmployeeRepo;
import com.example.demo.web.dto.EmployDto;
import com.example.demo.web.service.EmployeeService;

@RestController
public class EmployeeDetailsController {
@Autowired
EmployeeService empService;



	@RequestMapping(value="/getEmployeeDetails" , method=RequestMethod.GET)
	public List<EmployDto> getEmpDetails() {
		return empService.listEmpDetails();
	}	
	
	@RequestMapping(value="/saveEmployeeDetails" , method=RequestMethod.POST)
	public Employee saveEmpDetails(@RequestBody Employee e) {
		return empService.saveEmployeeDetails(e);		
	}	
	
	@RequestMapping(value="/getEmployeeDetailsByName/{empname}" , method=RequestMethod.GET)
	public List<Employee> fetchEmployeeDetails(@PathVariable String empname) {
		return empService.fetchEmployeeDetails(empname);
	}	
	
}
