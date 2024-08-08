package com.springcore.beanlifecyle;

public class Panipuri {
	private double price;

	public Panipuri() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting price");
	}
	

	public double getPrice() {
		return price;
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Panipuri [price=" + price + "]";
	}

	
}
