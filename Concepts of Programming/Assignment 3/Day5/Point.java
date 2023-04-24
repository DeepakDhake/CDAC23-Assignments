package com_D5.Day5;

public class Point {
	private int x,y;
	
	public Point() {
		System.out.println("Default Called");
		x = 0;
		y = 0;
	}
	
	public Point(int x,int y) {
		System.out.println("Parameterized Called");
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void display() {
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
}
