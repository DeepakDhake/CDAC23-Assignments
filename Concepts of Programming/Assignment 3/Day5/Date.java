package com_D5.Day5;

public class Date {
	private int day,month,year;
	public Date() {
		System.out.println("---inside Date class Default constr-----");
		day = 1;
		month = 1;
		year = 1970;
	}
	public Date(int day,int month,int year)
	{
		System.out.println("-----inside Date Class Parameterised Constr----");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
}
