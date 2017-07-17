package com.xsis.roeslan.javacoder;

import com.xsis.roeslan.javacoder.entity.Customer;
import com.xsis.roeslan.javacoder.service.CustomerService;

public class Main3 {


	public static void main(String[] args) {
		Customer ctm = new Customer();
//	Insert
//		ctm.setId("2");
		ctm.setNama("Roesland");
		ctm.setAddress("Bogoer");
		ctm.setNoHP("085817244510");
		CustomerService customerService = new CustomerService();
		customerService.insert(ctm);
//	Update
//		ctm.setNama("Ulul Maul");
//		ctm.setAddress("Cicuruk");
//		ctm.setNoHP("083812090921");
//		CustomerService customerService = new CustomerService();
//		customerService.update(2, ctm);
//	Delete
//		CustomerService customerService  = new CustomerService();
//		customerService.delete(2);
	}
}
