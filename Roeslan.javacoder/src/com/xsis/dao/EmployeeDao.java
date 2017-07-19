package com.xsis.dao;

import java.util.List;

import com.xsis.entity.Employee;

// definisi dao
public interface EmployeeDao {

//	Insert
	public void save(Employee emp);
	
//	Update
	public void update(int id, Employee emp);
	
//	Delete
	public void delete(int id);
	
//	Search 
	public List<Employee> getEmployeeByName(String name);
	
//	get All Employee
	public List<Employee> getAllEmployee();
	
//	Search By Email
	public Employee searchEmployeeByEmail(String email);
	
}
