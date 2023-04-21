package PackageTestDay3;
import java.util.Scanner;

import Day3.Person;
public class TesterPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person P1 = new Person();
		P1.display();
		Person P2  = new Person(23,"Deepak","Hyderabad");
		P2.display();
		System.out.println("Enter New Name to Set");
		P2.setName(sc.nextLine());
		//P2.setName(sc.nextLine());
		System.out.println("New name: "+P2.getName());
		System.out.println("Enter New Age to Set");
		P2.setAge(sc.nextInt());
		System.out.println("New age: "+P2.getAge());
		System.out.println("Enter New City to Set");
		P2.setCity(sc.next());
		System.out.println("New city: "+P2.getCity());
		P2.display();
	}

}
