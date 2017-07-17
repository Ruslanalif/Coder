package com.xsis.roeslan.javacoder.entity;

public class Product {

	private String id;
	private String name_item;
	private String price_list;
	private String kategory;
	
	public Product() {
	}

	public Product(String id, String name_item, String price_list, String kategory) {
		super();
		this.id = id;
		this.name_item = name_item;
		this.price_list = price_list;
		this.kategory = kategory;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName_item() {
		return name_item;
	}

	public void setName_item(String name_item) {
		this.name_item = name_item;
	}

	public String getPrice_list() {
		return price_list;
	}

	public void setPrice_list(String price_list) {
		this.price_list = price_list;
	}

	public String getKategory() {
		return kategory;
	}

	public void setKategory(String kategory) {
		this.kategory = kategory;
	}
	
}
