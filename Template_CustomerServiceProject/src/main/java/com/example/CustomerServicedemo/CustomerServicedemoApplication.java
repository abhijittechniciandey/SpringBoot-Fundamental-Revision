package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		 * You need to complete this application as mentioned in the problem statement
		 * build your own logic and perform the following tasks.
		 * 
		 * Tasks: 1. Load the beans from ApplicationContext.xml 2. Display all the
		 * departments available and get the input from user. 3. Get the message from
		 * user and store it into the respective department.
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerCare customerCare = null;
		String service = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Our Customer Care Application");
		System.out.println("Enter your Name");
		String CustomerName = sc.nextLine();

		System.out.println("Thanks for Reaching us" + CustomerName);
		System.out.println("Please select the department to connect to:");
		System.out.println("1. Payment Department");
		System.out.println("2. Query Department");
		System.out.println("3. Sales Department");
		System.out.println("0. Exit");

		int choice = sc.nextInt();
		sc.nextLine();

		if (choice >= 0 && choice < 4) {
			switch (choice) {
			case 1:
				service = "paymentDepartment"; // all are Bean Id and stored in service
				break;
			case 2:
				service = "queryDepartment";
				break;
			case 3:
				service = "salesDepartment";
				break;
			default:
				System.out.println("You have exited the application");
			}
			// Getting implemented service

			customerCare = service != null ? (CustomerCare) context.getBean(service) : null;
			customerCare.setCustomerName(CustomerName);
			customerCare.getService();

			String Issue = sc.nextLine();
			customerCare.setProblem(Issue);
			customerCare.getProblem(); // Custom message

		}

		else {
			System.out.println(
					"You have given wrong input would you like to continue using the customer care application");
			String wanttoContinue = sc.nextLine();
			System.out.println(wanttoContinue);
			if (wanttoContinue.equals("Yes")) {
				System.out.println("entered loop");
			} else {
				System.out.println("You have exited application");
			}
		}

	}

}
