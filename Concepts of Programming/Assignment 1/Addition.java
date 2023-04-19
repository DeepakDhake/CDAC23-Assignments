package Day1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter the value of A: ");
		a = sc.nextInt();
		System.out.println("Enter the value of B: ");
		b = sc.nextInt();
		c = a + b;
		System.out.println("Addition of A + B = "+ c);
	}

}
