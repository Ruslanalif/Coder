package com.xsis.entity;

public class Employee {
// pendeklarasian objek
	private int id;
	private String name;
	private String address;
	private Double salary;
	private String no_hp;
	
//	Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
//	GENERATE GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getNo_hp() {
		return no_hp;
	}

	public void setNo_hp(String no_hp) {
		this.no_hp = no_hp;
	}
//	GENERATE CONSTRUCTOR USING FIELDS
	public Employee(int id, String name, String address, Double salary, String no_hp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.no_hp = no_hp;
	}

}
