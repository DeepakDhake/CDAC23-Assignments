package com.app.fruits;

public class Apple extends Fruit{
	
	public Apple(String name, String color, double weight, boolean fresh) {
		super(name,color,weight,fresh);
	}
	
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
	
	public void jam() {
		System.out.println("Name"+getName());
		System.out.println("Making Jam!!!");
	}
}
