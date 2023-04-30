package com.Student;

public class student {
	
	private int rollno;
	private String name,address,email;
	
	public student(int rollno,String name,String address,String email) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRollno() {
		return rollno;
	}
	

}
