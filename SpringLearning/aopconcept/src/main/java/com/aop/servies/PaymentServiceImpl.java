package com.aop.servies;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment() {
		
		//Payment code
		System.out.println("Amount Debited ....");
		
		
		System.out.println("Amount Credited ...");
		
	}

}
