package com_D5.Day5;

public class Person {
	private String name,city;
	private int age;
	
	public Person() {
		name = "ABC";
		city = "Pune";
		age = 23;
	}
	
	public Person(String name,String city,int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("Name: "+getName()+" City: "+getCity()+" Age: "+getAge());
	}
	
}
