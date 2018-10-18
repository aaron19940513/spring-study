package com.study.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.jdbc.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		User user = new User("张三", 20, "男");
		userService.save(user);
		List<User> person1 = userService.getUser();
		for (User persion : person1) {
			System.out.println(
					persion.getId() + "  " + persion.getName() + "  " + persion.getSex() + "  " + persion.getAge());
		}
	}

}
