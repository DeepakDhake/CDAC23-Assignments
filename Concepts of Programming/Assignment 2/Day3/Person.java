package Day3;
import java.util.Scanner;
public class Person {

	private int age;
	private String name,city;
	
	public Person(){	
		System.out.println("---Default Constructor called---");
		age = 22;
		name = "Deepak";
		city = "Pune";
	}
	
	public Person(int age,String name,String city){	
		System.out.println("---Parameterized Constructor called---");
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
	}
	
}
