package com.example.demo.web.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
@NamedNativeQuery(name = "findByName", query = "SELECT * FROM employee WHERE name = ?", resultClass = Employee.class)

public class Employee {
	
	  @Id  
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	  private String name;
	
	  private float salary;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}


}
