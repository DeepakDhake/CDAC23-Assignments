package Day1;

import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		num = sc.nextInt();
		temp = num;
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum + r*r*r;
		}
		if(temp == sum)
			System.out.println("Number is an Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}

