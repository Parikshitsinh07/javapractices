package com.springcoreci;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {
	public static void main(String [] args)
	{
		ApplicationContext  context=new ClassPathXmlApplicationContext("com/springcoreci/ciconfig.xml");
		Person p=(Person)context.getBean("person");
		
		System.out.println(p);
	}
}
