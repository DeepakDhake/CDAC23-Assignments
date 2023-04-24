package com_D5.PackageTestDay5;
import com_D5.Day5.Person;
import java.util.Scanner;
public class TesterPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		Person p2 = new Person("Deepak","Pune",1);
		p1.display();
		p2.display();
		
		p1.setName(sc.nextLine());
		p1.setCity(sc.nextLine());
		p1.setAge(sc.nextInt());
		System.out.println("Updated Name: "+p1.getName());
		System.out.println("Updated City: "+p1.getCity());
		System.out.println("Updated Age: "+p1.getAge());
		p1.display();
	}

}
