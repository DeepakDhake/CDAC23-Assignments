package PackageTestDay3;
import java.util.Scanner;

import Day3.Employee;
public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		E1.displayInfo();
		Employee E2 = new Employee(101,"Sahil");
		E2.displayInfo();
		
		E1.acceptInfo();
		E1.displayInfo();
	}

}
