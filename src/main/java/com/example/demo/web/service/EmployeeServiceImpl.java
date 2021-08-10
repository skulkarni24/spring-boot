package com.example.demo.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.dao.EmployeeDao;
import com.example.demo.web.dao.EmployeeRepo;
import com.example.demo.web.dto.EmployDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	EmployeeDao dao;
	
	@Autowired
	EntityManager em;
	
	
	@Override
	public List<EmployDto> listEmpDetails() {
		List<Employee> source = repo.listEmpDetails();
		List<EmployDto> target = new ArrayList<EmployDto>();
        source.forEach(s ->{
        	EmployDto p = new EmployDto();
        	p.setName(s.getName());
        	if(s.getSalary() > 20000) {
        		p.setMananger(true);
        	}
        	target.add(p);
        });
		
		
		return target;
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
