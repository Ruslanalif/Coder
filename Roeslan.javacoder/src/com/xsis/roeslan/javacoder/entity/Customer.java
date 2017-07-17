package com.xsis.roeslan.javacoder.entity;

public class Customer {

	private String id;
	private String nama;
	private String address;
	private String noHP;
	
	public Customer(String id, String nama, String address, String noHP) {
		super();
		this.id = id;
		this.nama = nama;
		this.address = address;
		this.noHP = noHP;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNoHP() {
		return noHP;
	}
	public void setNoHP(String noHP) {
		this.noHP = noHP;
	}
	public Customer() {
	}
}
