////package com.xsis.controller;
//
////import java.util.ArrayList;
////import java.util.List;
//
////import com.xsis.entity.Employee;
////import com.xsis.service.EmployeeService;
//
////public class DataCollection {
//// Array tujuan dari list
////	Single record
//	public Employee getEmployee(){
//		Employee emp = new Employee();
//		emp.setName("Ardy");
//		emp.setId(2);
//		return emp;
//	}
////	Multiple record
//	public List<Employee> getAllEmployee(){
//		List<Employee> listEmp = new ArrayList<>();
//		Employee emp = new Employee(1,"Rudy","Jakarta", null, null);
//		Employee emp1 = new Employee(2,"Roeslan","Bogor", null, null);
//		Employee emp2 = new Employee(3,"Ogen","Cisarua", null, null);
//
//		listEmp.add(emp);
//		listEmp.add(emp1);
//		listEmp.add(emp2);
//		return listEmp;
//	}
//	public static void main(String[] args) {
//		DataCollection dc = new DataCollection();
////		Call Single data
//		Employee emp = dc.getEmployee();
////		CAll Multife
//		List<Employee> listData = dc.getAllEmployee();
////get from database
//	 		EmployeeService es = new EmployeeService();
//			Employee emp2 = es.getEmployeeById(100);
//			
//			System.out.println("name : "+ emp2.getName());
//			
//			List<Employee> listData2 = es.getAllEmployee();
//			//extract
//			for(Employee data : listData2){
//				System.out.println("name : "+ data.getName());
//			}
//			
//	}
//}
