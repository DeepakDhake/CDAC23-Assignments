package Day1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num,fact=1;
		num = sc.nextInt();
		for(int i = 0; i<num;i++) {
			fact = fact * (num-i) ;
		}
		System.out.println("Factorial = "+fact);
	}

}
