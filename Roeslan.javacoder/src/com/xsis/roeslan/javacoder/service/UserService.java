package com.xsis.roeslan.javacoder.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xsis.roeslan.javacoder.DbUtils;
import com.xsis.roeslan.javacoder.entity.User;

public class UserService {

	public void insert(User user){
		String sql = "INSERT INTO xsis_users (id, name, address, no_session) values(?,?,?,?)";
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getAddress());
			ps.setString(4, user.getNo_session());
			ps.executeUpdate();
			System.out.println(user.getName() + " Insered");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void update(int id, User user){
		String sql = "UPDATE xsis_users SET name = ?, address = ? , no_session = ? WHERE id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.setString(1, user.getName());
			ps.setString(2, user.getAddress());
			ps.setString(3, user.getNo_session());
			ps.executeUpdate();
			System.out.println(user.getName() + " Berhasil diupdate");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
