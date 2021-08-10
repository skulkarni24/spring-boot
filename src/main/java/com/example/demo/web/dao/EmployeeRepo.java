package com.example.demo.web.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
     
   
     
    @Query("SELECT e FROM Employee e WHERE e.id = :id")
    public List<Employee> listEmpDetailsById(@Param("id") Long id);

    @Query("SELECT e FROM Employee e")
	public List<Employee> listEmpDetails();
    
    
    
}