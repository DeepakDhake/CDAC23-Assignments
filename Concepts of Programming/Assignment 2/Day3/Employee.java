package Day3;
import java.util.Scanner;
public class Employee {
	private int id;
	private String name;
	
	
	public Employee(){
		System.out.println("---Default Constructor Called---");
		id = 0;
		name = "Abc";
	}
	
	public Employee(int id,String name)
	{
		System.out.println("---Parameterised Constructor Called---");
		this.id = id;
		this.name = name;
	}
	
	
	public void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name = sc.next();
	}
	
	public void displayInfo() 
	{
	System.out.println("Employee ID: "+id);
	System.out.println("Employee Name: "+name);
	}

}
