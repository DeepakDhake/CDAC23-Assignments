package com.core;

import java.time.LocalDate;

public class Customer {


	private static int counter = 1;
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private Serplan plan;
	private double reg_amt;
	private LocalDate DOB;
	
	public Customer(String fname, String lname, String email, String pass, Serplan plan, double reg_amt,
			LocalDate dOB) {
		super();
		this.id = counter++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.plan = plan;
		this.reg_amt = reg_amt;
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Serplan getPlan() {
		return plan;
	}

	public void setPlan(Serplan plan) {
		this.plan = plan;
	}

	public double getReg_amt() {
		return reg_amt;
	}

	public void setReg_amt(double reg_amt) {
		this.reg_amt = reg_amt;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", plan=" + plan
				+ ", reg_amt=" + reg_amt + ", Age=" + DOB + "]";
	}
		
}
