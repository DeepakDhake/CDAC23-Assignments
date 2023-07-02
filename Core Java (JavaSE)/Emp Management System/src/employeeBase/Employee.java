package employeeBase;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	private String id;
	private String fname;
	private String lname;
	private double Sal;
	private Dept department;
	private LocalDate date;

	public Employee(String id, String fname, String lname, double sal, Dept department, LocalDate date) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.Sal = sal;
		this.department = department;
		this.date = date;
	}

//	public Employee(String id)
//	{
//		this.id = id;
//	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getSal() {
		return Sal;
	}

	public Dept getDepartment() {
		return department;
	}

	public LocalDate getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + id + ", fname=" + fname + ", lname=" + lname + ", Sal=" + Sal + ", department="
				+ department + ", date=" + date + "]\n";
	}

}
