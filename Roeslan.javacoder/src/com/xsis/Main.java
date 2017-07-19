package com.xsis;

import java.util.List;

import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.entity.Employee;

public class Main {

	public void dataEmployee(){
		//get from database
 		EmployeeDaoImpl es = new EmployeeDaoImpl();
 		
 		List<Employee> listData2 = es.getAllEmployee();
 		//extract
 		for(Employee data : listData2){
 			System.out.println(data.getId() + "	 "+ data.getName() + "	 "+ data.getAddress() + "	 "+  data.getSalary() + "	 "+ data.getNo_hp());
 		}
 	
	}
	public void dataEmployeeByName(){
		//get from database
 		EmployeeDaoImpl es = new EmployeeDaoImpl();
 		
 		List<Employee> listData2 = es.getEmployeeByName("ziz");
 		//extract
 		for(Employee data : listData2){
 			System.out.println(data.getId() + "	 "+ data.getName() + "	 "+ data.getAddress() + "	 "+  data.getSalary() + "	 "+ data.getNo_hp());
 		}
 	
	}
	public void save(){
		
	}
	public static void main(String[] args) {
		Main s = new Main();
//		s.dataEmployee();
		s.dataEmployeeByName();
	}
}
