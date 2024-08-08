package com.springcore.beanlifecyle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class Test {
	public static void main(String [] args)
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanlifecyle/config.xml");
		Panipuri p1=(Panipuri) context.getBean("p1");
		System.out.println(p1);
		context.registerShutdownHook();
		
		System.out.println("---------------------------->");
		Pepsi pep1=(Pepsi)context.getBean("pep1");
		System.out.println(pep1);
		
		Examle example=(Examle)context.getBean("example");
		System.out.println(example);
	}
	}
	
