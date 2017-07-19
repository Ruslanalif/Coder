package com.xsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsis.dbConnect.DbUtils;
import com.xsis.entity.Employee;
import com.xsis.service.EmployeeService;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Connection conn = DbUtils.getConnect();
	private static final String SQL_SAVE = "INSERT INTO xsis_employees (id, name, address, salary, no_hp) VALUES(SEQ_D.nextval, ?, ?, ?, ? )";//object yang tetap, tadak bisa diubah lagi

	private static final String SQL_GETALLEMPLOYEE = "SELECT * FROM xsis_employees";
	
	private static final String SQL_UPDATE = "UPDATE XSIS_EMPLOYEES SET NAME = ?, ADDRESS = ?, SALARY = ?, NO_HP = ? WHERE ID = ?";
	
	private static final String SQL_DELETE = "DELETE FROM XSIS_EMPLOYEES WHERE ID = ?";
	
	private static final String SQL_GETBYEMAIL = "SELECT * FROM XSIS_EMPLOYEES WHERE ID = ?";
	
	private static final String SQL_GETBYENAME = "SELECT * FROM XSIS_EMPLOYEES WHERE upper(NAME) LIKE  upper('%A%')";
	
	
	
	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_SAVE, conn);
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNo_hp());
			ps.executeUpdate();
			System.out.println("Data Tersimpan");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public void update(int id, Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_UPDATE, conn);
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNo_hp());
			ps.setInt(5, id);
			ps.executeUpdate();
			System.out.println("Data Terupdate");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_DELETE, conn);
		try {
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Data Terhapus");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> listEmp = new ArrayList<>();
		PreparedStatement ps = null;
 		ResultSet rs = null;
 		try{
 		ps = DbUtils.getPreparedStatement(SQL_GETBYENAME, conn);
 		rs = ps.executeQuery();
 		
 		//extract
 		while(rs.next()){ //jika rs dapat data dari database
 			Employee emp = new Employee();
 			emp.setId(rs.getInt("id"));
 			emp.setName(rs.getString("name"));
 			emp.setAddress(rs.getString("address"));
 			emp.setSalary(rs.getDouble("salary"));
 			emp.setNo_hp(rs.getString("no_hp"));
 			listEmp.add(emp);
 		}
 	
 		}catch(Exception e){
 			e.printStackTrace();
 		}
 		
 		return listEmp;
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> listEmp = new ArrayList<>();
		PreparedStatement ps = null;
 		ResultSet rs = null;
 		try{
 		ps = DbUtils.getPreparedStatement(SQL_GETALLEMPLOYEE, conn);
 		rs = ps.executeQuery();
 		
 		//extract
 		while(rs.next()){ //jika rs dapat data dari database
 			Employee emp = new Employee();
 			emp.setId(rs.getInt("id"));
 			emp.setName(rs.getString("name"));
 			emp.setAddress(rs.getString("address"));
 			emp.setSalary(rs.getDouble("salary"));
 			emp.setNo_hp(rs.getString("no_hp"));
 			listEmp.add(emp);
 		}
 	
 		}catch(Exception e){
 			e.printStackTrace();
 		}
 		
 		return listEmp;
	}
	@Override
	public Employee searchEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		 		ResultSet rs = null;
		 		Employee emp = new Employee();
		 		try{
		 		ps = DbUtils.getPreparedStatement(SQL_GETBYEMAIL, conn);
		 		ps.setString(1, email);
		 		rs = ps.executeQuery();
		 		
		 		//extract
		 		while(rs.next()){ //jika rs dapat data dari database
		 			emp.setName(rs.getString("id,name"));
		 		}
		 		
		 		}catch(Exception e){
		 			e.printStackTrace();
		 		}
		 		return emp;
	}
}
