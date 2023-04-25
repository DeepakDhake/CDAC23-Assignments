package com_D5.Day5;

public class NewStudent {
	private static int rollno = 0;
	private String name, address;

	public NewStudent(String name, String address) {
		rollno++;
		this.name = name;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void display() {
		System.out.println("Student Details \nRoll No: " + this.rollno + " Name: " + this.getName() + " Address: "
				+ this.getAddress());
	}

}
