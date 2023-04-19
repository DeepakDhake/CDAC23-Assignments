package Day1;

import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		boolean isPrime = false;
		System.out.print("Enter the Number: ");
		num = sc.nextInt();
		for(int i = 2; i<num;i++)
		{
			if(num%i==0)
			isPrime = true;
		}
		if(isPrime==false)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
}

