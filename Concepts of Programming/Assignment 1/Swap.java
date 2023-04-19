package Day1;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter value of a and b ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		sc.close();
	}

}
