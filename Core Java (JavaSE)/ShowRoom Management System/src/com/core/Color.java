package com.core;

public enum Color {
	WHITE(0), BLACK(0), RED(2000), BLUE(2500), GREY(3000), YELLOW(4000), GREEN(5000);

	private double price;

	private Color(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
}
