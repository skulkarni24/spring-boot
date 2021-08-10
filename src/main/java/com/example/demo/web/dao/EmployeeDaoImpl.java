package com.example.demo.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	/*
	 * @Autowired Session session;
	 */
	
	@Override
	public List<Employee> fetchEmployeeDetails() {
		
		return null;
		/*
		 * Criteria cr = session.createCriteria(Employee.class); List results =
		 * cr.list(); return results;
		 */
	}

}
