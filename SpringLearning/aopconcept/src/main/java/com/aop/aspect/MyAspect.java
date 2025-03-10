package com.aop.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class MyAspect {
	@Before(value = "execution(* com.aop.servies.PaymentServiceImpl.makePayment())")
	public void printBefore()
	{
		
		System.out.println("Payment Started");
	}
	@After(value = "execution(* com.aop.servies.PaymentServiceImpl.makePayment())")
	public void printAfter()
	{
		
		System.out.println("Payment done");
	}
}
