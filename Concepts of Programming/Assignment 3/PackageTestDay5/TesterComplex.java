package com_D5.PackageTestDay5;
import java.util.Scanner;
import com_D5.Day5.ComplexNumber;
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
		c1.display();
		System.out.print("Enter Real number to be Updated: ");
		c1.setReal(sc.nextInt());
		System.out.print("Enter Imaginary number to be Updated: ");
		c1.setImaginary(sc.nextInt());
		System.out.println("Updated Real Number = "+c1.getReal());
		System.out.println("Updated Imaginary Number = "+c1.getImaginary());
		c1.display();
	}
}
