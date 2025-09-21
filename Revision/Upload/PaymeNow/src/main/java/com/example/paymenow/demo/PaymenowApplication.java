package com.example.paymenow.demo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.paymentservice.PaymentService;

@SpringBootApplication
public class PaymenowApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		String service = null;
		PaymentService paymentService = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Our Payment Service Application");
		System.out.println("Enter your Name");
		String CustomerName = sc.nextLine();

		System.out.println("Thanks for Reaching us" + CustomerName);
		System.out.println("Please select the service to connect to:");
		System.out.println("1. Credit Card Service");
		System.out.println("2. Pay Pal Service");
		System.out.println("3. Bank Transfer Service");
		System.out.println("0. Exit");

		int choice = sc.nextInt();
		sc.nextLine();

		if (choice >= 0 && choice < 4) {
			switch (choice) {
			case 1:
				service = "creditCardPaymentService"; // all are Bean Id and stored in service
				break;
			case 2:
				service = "payPalPaymentService";
				break;
			case 3:
				service = "bankTransferPaymentService";
				break;
			default:
				System.out.println("You have exited the application");
			}

			paymentService = service != null ? (PaymentService) context.getBean(service) : null;
			paymentService.processPayment();

		}

		else {
			System.out.println(
					"You have given wrong input would you like to continue using the Payment service application");
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
