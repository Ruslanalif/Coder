package com.xsis.roeslan.javacoder;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert {   
    
    public static void main(String[] args) throws SQLException {
		Connection koneksi = Koneksi.getKoneksi();
		Statement st = koneksi.createStatement();
		st.executeUpdate("INSERT INTO mahasiswa_example VALUES('022','Ganteng','UI','3','800000')");
		System.out.println("Row Insered");
	}
}
