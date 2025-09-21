package com.example.paymentservice;

import java.util.Scanner;

public class CreditCardPaymentService implements PaymentService {
	
	Scanner sc =new Scanner(System.in);
	int payment=sc.nextInt();

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment of $"+payment);
	}

}
