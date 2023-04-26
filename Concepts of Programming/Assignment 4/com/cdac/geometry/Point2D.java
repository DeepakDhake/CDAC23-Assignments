package com.cdac.geometry;

public class Point2D {

	private double x;
	private double y;
	
	boolean isEqual = false;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String show() {
		return "X: " + x + "Y: " + y;
	}

	public boolean isEqual(Point2D obj) {
		return this.x == obj.x && this.y == obj.y;
	}
	
	public double calculateDistance(Point2D obj) {
		double x1 = this.x - obj.x;
		double y1 = this.y - obj.y;
		return Math.sqrt(x1 * x1 + y1 * y1);
	}
	
}
