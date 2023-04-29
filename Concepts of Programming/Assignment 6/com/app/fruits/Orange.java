package com.app.fruits;

public class Orange extends Fruit{

	public Orange(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}
	
	@Override 
	public String taste() {
		return "Sour";
	}
	
	public void juice() {
		System.out.println("Name "+ getName()+ " Weight "+getWeight());
		System.out.println("Extracting Juice!!!");
		
	}
	

}
