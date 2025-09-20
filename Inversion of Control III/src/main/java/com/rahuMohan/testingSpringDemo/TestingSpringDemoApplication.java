package com.rahuMohan.testingSpringDemo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class TestingSpringDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestingSpringDemoApplication.class, args);
		System.out.println("Welcome ! please use a size of table");
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		
		// Table shortTable = new ShortTable();
		// Table longTable = new longTable();
		
		/*To communicate with Spring we need .xml file to tell spring how to create object i.e context file*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from context via bean id
		// advantage: only we need to change context file if we want to add anything
		Table longTable = (Table) context.getBean("longTable");
		Table shortTable = (Table) context.getBean("shortTable");
		if(size.equals("long")) {
			System.out.println(longTable.showDetails());
		}else {
			System.out.println(shortTable.showDetails());
		}
	}

}
