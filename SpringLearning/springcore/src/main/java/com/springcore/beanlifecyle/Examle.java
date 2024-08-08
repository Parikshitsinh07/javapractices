package com.springcore.beanlifecyle;

public class Examle {
	private String subject;

	public String getSubject() {
		return subject;
	}

	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Examle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Examle [subject=" + subject + "]";
	}
	
	//@PostConstruct
	public void start()
	{
		System.out.println("Starting method");
	}
	
	//@PreDestroy
	public void end()
	{
		System.out.println("Ending method");
	}

}
