package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String name, String color, double weight, boolean fresh)
	{
		super(name, color, weight, fresh);
	}
	
	@Override
	public String taste() {
		return "Sweet";
	}
	
	
	public void pulp() {
		System.out.println("Name "+getName()+" Color "+getColor()+ " Creating Pulp!!!");
	}
	
	
}
