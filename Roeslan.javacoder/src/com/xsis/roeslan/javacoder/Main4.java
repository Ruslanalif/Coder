package com.xsis.roeslan.javacoder;

import com.xsis.roeslan.javacoder.entity.Product;
import com.xsis.roeslan.javacoder.service.ProductService;

public class Main4 {

	public static void main(String[] args) {
		Product product = new Product();
//	Insert
		product.setId("1");
		product.setName_item("Beng - beng");
		product.setPrice_list("1.500");
		product.setKategory("Makanan Ringan");

		ProductService productService = new ProductService();
		productService.insert(product);
// Update
//		product.setName_item("Beng - beng");
//		product.setPrice_list("2000");
//		product.setKategory("Makanan Ringan");
//
//		ProductService productService = new ProductService();
//		productService.update(1, product);
//	Delete
//		ProductService productService = new ProductService();
//		productService.delete(1);
	}
}
