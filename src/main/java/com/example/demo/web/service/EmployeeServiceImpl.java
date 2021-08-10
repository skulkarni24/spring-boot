package com.example.demo.web.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.dao.EmployeeDao;
import com.example.demo.web.dao.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	EmployeeDao dao;
	
	@Autowired
	EntityManager em;
	
	
	@Override
	public List<Employee> listEmpDetails() {
		return repo.listEmpDetails();
	}

	@Override
	public Employee saveEmployeeDetails(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public List<Employee> fetchEmployeeDetails(String empName) {
		Query q = em.createNamedQuery("findByName");
		q.setParameter(1, empName);
		List a = q.getResultList();
		return a;
		}

}
