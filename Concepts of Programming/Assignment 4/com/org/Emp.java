package com.app.org;

public class Emp {
	private int id;
	private String firstName;
	private String lastName;
	private int deptId;
	public double basic;
	private static int nextId = 1;

	public Emp(String firstName, String lastName, int deptId, double basic) {
		this.id = nextId++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = deptId;
		this.basic = basic;
	}

	public String toString() {
		return "Emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", deptId=" + deptId + "]";
	}

	public double computeNetSalary() {
		return basic;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDeptId() {
		return deptId;
	}

	public double getBasic() {
		return basic;
	}
}
