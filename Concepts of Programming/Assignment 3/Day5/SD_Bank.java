package com_D5.Day5;

public class SD_Bank {
	
	private int Actid;
	private String name,city,email;
	private double balance;

	public SD_Bank(int Actid,String name,String city,String email,double balance) {

		this.Actid = Actid;
		this.name = name;
		this.city = city;
		this.email = email;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActid() {
		return Actid;
	}

	public double getBalance() {
		return balance;
	}

	public void displayInfo() {
		System.out.println("Account ID: "+Actid+" Name: "+name+" City: "+city+" Email: "+email+" Account Balance: "+balance);
	}
	
	public void depositMoney(double money) {
		this.balance = this.balance + money;
	}
	
	public void withdrawMoney(double money) {
		if(this.balance<money) {
			System.out.println("Insufficient Balance");
		}
		else
		{
		this.balance = this.balance - money;
		}
	}
	
	public void moneyTransfer(SD_Bank receiver,double amount) {
		//receiver is used to catch all parameter sent from act1 or act2.
		this.balance = this.balance - amount;//the object which called this method that object balance gets deducted.
		receiver.balance = receiver.balance + amount;
		System.out.println("Money Transfered From :"+ this.getName()+"   To "+receiver.getName());
		System.out.println("After money transfer "+this.getName()+" balance is Rs."+this.balance);
	}



}
