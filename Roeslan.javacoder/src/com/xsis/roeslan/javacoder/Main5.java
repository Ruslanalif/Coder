package com.xsis.roeslan.javacoder;

import com.xsis.roeslan.javacoder.entity.User;
import com.xsis.roeslan.javacoder.service.UserService;

public class Main5 {

	public static void main(String[] args) {
		User user = new User();
//		user.setId("2");
//		user.setName("Ulul");
//		user.setAddress("Cicuruk");
//		user.setNo_session("N001");
//		UserService userService = new UserService();
//		userService.insert(user);
//	Update
		user.setName("ul");
		user.setAddress("Ciuruk");
		user.setNo_session("N001");
		UserService userService = new UserService();
		userService.update(1, user);

	}
}
