package com.xsis.roeslan.javacoder.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xsis.roeslan.javacoder.DbUtils;
import com.xsis.roeslan.javacoder.entity.Product;

public class ProductService {

	public void insert(Product product){
		String sql = "Insert Into xsis_product (id, name_item, price_list, category) values(?,?,?,?)";
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.setString(1, product.getId());
			ps.setString(2, product.getName_item());
			ps.setString(3, product.getPrice_list());
			ps.setString(4, product.getKategory());
			ps.executeUpdate();
			System.out.println(product.getName_item() + " Berhasil Di simpan");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void update(int id, Product product){
		String sql = "UPDATE xsis_product SET name_item = ?, price_list = ?, category = ? where id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.setString(1, product.getName_item());
			ps.setString(2, product.getPrice_list());
			ps.setString(3, product.getKategory());
			ps.executeUpdate();
			System.out.println(product.getName_item() + " Berhasil Di Update");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void delete(int id){
		String sql = "DELETE FROM xsis_product where id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
		try {
			ps.executeUpdate();
			System.out.println(id + " Berhasil Di Hapus");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
