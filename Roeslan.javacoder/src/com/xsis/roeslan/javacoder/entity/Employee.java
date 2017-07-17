package com.xsis.roeslan.javacoder.entity;

public class Employee {
	private String id;
	private String nama;
	private String address;
	private Double salary;
	private String noHP;

	


	public Employee(String id, String nama, String address, Double salary, String noHP) {
		super();
		this.id = id;
		this.nama = nama;
		this.address = address;
		this.salary = salary;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	} 
	
	public String getNoHP() {
		return noHP;
	}

	public void setNoHP(String noHP) {
		this.noHP = noHP;
	}

	public Employee() {
	}
	public void info(){
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.nama);
		System.out.println("Addres : " + this.address);
		System.out.println("Salary : " + this.salary);
	}

	public static void main(String[] args) {

	}

}
