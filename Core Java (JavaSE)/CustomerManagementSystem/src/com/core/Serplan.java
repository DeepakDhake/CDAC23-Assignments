package com.core;

public enum Serplan {
	
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double plan;
	
	private Serplan (double plan)
	{
		this.plan = plan;
	}

	public double getPlan() {
		return plan;
	}
	
}
