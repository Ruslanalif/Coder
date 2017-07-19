package com.xsis.service;

//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xsis.dao.EmployeeDao;
import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.dbConnect.DbUtils;
import com.xsis.entity.Employee;

public class EmployeeService {
// Polimorphism
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
//	save
	public List<Employee> getAllEmployee(){
			
		return employeeDao.getAllEmployee();
	}

	public Employee getEmployeeById(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
/*//	Get data
	public Employee getEmployeeById(int id){
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ? ";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Employee emp = null;
		try {
			ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			 emp = new Employee();
// exstract
			 while(rs.next()){
				emp.setName(rs.getString("first_name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emp;
	}
	public List<Employee> getAllEmployee(){
		String sql = "select * from employees";
		 		
		 		List<Employee> listEmp = new ArrayList<>();
		 		PreparedStatement ps = null;
		 		ResultSet rs = null;
		 		try{
		 		ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		 		rs = ps.executeQuery();
		 		
		 		//extract
		 		while(rs.next()){ //jika rs dapat data dari database
		 			Employee emp = new Employee();
		 			emp.setName(rs.getString("first_name"));
		 			listEmp.add(emp);
		 		}
		 	
		 		}catch(Exception e){
		 			e.printStackTrace();
		 		}
		 		
		 		return listEmp;
	}*/
}
