package com.app.fruits;

public abstract class Fruit {

	private String name, color;
	private double weight;
	private boolean fresh;

	public Fruit(String name, String color, double weight, boolean fresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = true;
	}

	public abstract String taste();
	
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isFresh() {
		return fresh;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Color: " + color + " Weight: " + weight;

	}

}
