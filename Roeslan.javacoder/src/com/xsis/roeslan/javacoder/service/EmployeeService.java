package com.xsis.roeslan.javacoder.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xsis.roeslan.javacoder.DbUtils;
import com.xsis.roeslan.javacoder.entity.Employee;

public class EmployeeService {

//	sql
//	insert
	public void insert(Employee employee){
		String sql = "insert into xsis_employees (id, name, address, salary, no_hp) values (?, ?, ?, ?, ? )";
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
				 		try {
				 			ps.setString(1, employee.getId());
				 			ps.setString(2, employee.getNama());
				 			ps.setString(3, employee.getAddress());
				 			ps.setDouble(4, employee.getSalary());
				 			ps.setString(5, employee.getNoHP());
				 			ps.executeUpdate();
				 			System.out.println(employee.getNama() + " berhasil tersimpan");
				 		} catch (SQLException e) {
				 			// TODO Auto-generated catch block
				 			e.printStackTrace();
				 		}
	}
//	update
	public void update(int id, Employee emp){
		
	}
//	delete
	public void delete(int id){
		
	}
}
