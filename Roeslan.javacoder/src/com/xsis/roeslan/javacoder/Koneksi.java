package com.xsis.roeslan.javacoder;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection cn;    
    public static Connection getKoneksi(){
        if (cn == null) {
            try {
                cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
                e.printStackTrace();
            }            
        }
        return cn;
    }       
}
