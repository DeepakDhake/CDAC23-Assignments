package PackageTestDay3;
import java.util.Scanner;

import Day3.ComplexNumber;
public class TesterComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber c1 = new ComplexNumber();
		c1.display();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Real number: ");
		c1.setReal(sc.nextInt());
		System.out.print("Enter Imaginary number: ");
		c1.setImaginary(sc.nextInt());
		System.out.println("Real Number = "+c1.getReal());
		System.out.println("Imaginary Number = "+c1.getImaginary());
		c1.display();
	}

}
