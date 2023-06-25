package com.core;

import java.io.Serializable;
import java.time.LocalDate;

import enm.RoomType;

@SuppressWarnings("serial")
public class Patient implements Serializable{
	
	private int serialNo;
	private String Name;
	private String Address;
	private String Gender;
	private String disease;
	private int age;
	private int Mobno;
	private double salary;
	private LocalDate admitDate;
	private RoomType room;
	
	public Patient(int serialNo, String name, String address, String gender, String disease, int age, int mobno,
			double salary, LocalDate admitDate, RoomType room) {
		super();
		this.serialNo = serialNo;
		Name = name;
		Address = address;
		Gender = gender;
		this.disease = disease;
		this.age = age;
		Mobno = mobno;
		this.salary = salary;
		this.admitDate = admitDate;
		this.room = room;
	}
	
	public Patient(int serialNo) {
		super();
		this.serialNo = serialNo;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobno() {
		return Mobno;
	}

	public void setMobno(int mobno) {
		Mobno = mobno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}

	public RoomType getRoom() {
		return room;
	}

	public void setRoom(RoomType room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "\nPatient [SerialNo=" + serialNo + ", Name=" + Name + ", Address=" + Address + ", Gender=" + Gender
				+ ", disease=" + disease + ", age=" + age + ", Mobno=" + Mobno + ", salary=" + salary + ", admitDate="
				+ admitDate + ", room=" + room + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Patient)
			return this.serialNo == ((Patient) obj).serialNo;
		return false;			
	}
	
	

}
