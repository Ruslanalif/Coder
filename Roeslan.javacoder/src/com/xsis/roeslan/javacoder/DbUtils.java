package com.xsis.roeslan.javacoder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUtils {
	private static Connection CONN = null;
	private static final String USERNAME = "hr";
	private static final String PASSWORD = "hr";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	Connection
	public static Connection getConnect(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			CONN = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("Connection Failed!!");
		}
		return CONN;
	}
//	Query
	public static PreparedStatement getPreparedStatement(String sql, Connection connect){
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connect.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}
}
