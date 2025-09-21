package com.example.paymentservice;

import java.util.Scanner;

public class BankTransferPaymentService implements PaymentService {
	
	Scanner sc =new Scanner(System.in);
	int payment=sc.nextInt();
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing Bank Transfer payment of $"+payment);
	}

}

