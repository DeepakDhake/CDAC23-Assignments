package com.core;

import java.time.LocalDate;

public class Vehicle {

	private int id;
	private String chasisNo;
	private Color colour;
	private double netPrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable = true;
	private static int counter = 1;
	public Vehicle(String chasisNo, Color colour, double netPrice, LocalDate manufactureDate, String company) {
		this.id = counter++;
		this.chasisNo = chasisNo;
		this.colour = colour;
		this.netPrice = netPrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		//this.isAvailable = isAvailable;
		
	}	
	
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}
	
	public String getChasisNo() {
		return chasisNo;
	}

	public int getId() {
		return id;
	}

	public Color getColour() {
		return colour;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public String getCompany() {
		return company;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	@Override
	public String toString() {
		return "Id: " + id + " ChasisNo: " + chasisNo + " Colour: " + colour + " NetPrice: " + netPrice
				+ " Manufacturing Date: " + manufactureDate + " Company: " + company + " Available: " + isAvailable;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) obj).chasisNo);
		return false;
	}
	
	

}
