package com.xsis.roeslan.javacoder.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xsis.roeslan.javacoder.DbUtils;
import com.xsis.roeslan.javacoder.entity.Customer;

public class CustomerService {

	public void insert(Customer customer){
		String sql = "INSERT INTO xsis_customers (id, name, address, no_hp) values(SEQ_D.nextval,?,?,?)";
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.setString(1, customer.getNama());
			ps.setString(2, customer.getAddress());
			ps.setString(3, customer.getNoHP());
			ps.executeUpdate();
			System.out.println(customer.getNama() + " Berhasil disimpan.");
		} catch (SQLException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
	public void update(int id, Customer customer){
		String sql = "Update xsis_customers set name = ?, address = ?, no_hp = ? where id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.setString(1, customer.getNama());
			ps.setString(2, customer.getAddress());
			ps.setString(3, customer.getNoHP());
			ps.executeUpdate();
			System.out.println(customer.getNama() + " Berhasil Update.");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void delete(int id){
		String sql = "DELETE FROM xsis_customers WHERE id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.executeUpdate();
			System.out.println(id + " Berhasil Dihapus.");	
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
