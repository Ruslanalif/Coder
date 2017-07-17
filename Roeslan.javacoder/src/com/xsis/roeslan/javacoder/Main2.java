package com.xsis.roeslan.javacoder;

import com.xsis.roeslan.javacoder.entity.Employee;
import com.xsis.roeslan.javacoder.service.EmployeeService;

public class Main2 {
	public static void main(String[] args) {
	Employee emp = new Employee();
	emp.setId("4");
	emp.setNama("Aszis");
	emp.setAddress("Banten");
	emp.setNoHP("0880989090");
	emp.setSalary(4000.0);

	 		Employee asziz = new Employee	("3", "asziz", "jakarta selatan", 6000.0, "09876544");
	 		EmployeeService employeeService = new EmployeeService();
	 		
	 		employeeService.insert(asziz);
	 		employeeService.insert(emp);
	}
}
