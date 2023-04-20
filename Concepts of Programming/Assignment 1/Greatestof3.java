package Day1;
import java.util.Scanner;
public class Greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of A,B and C: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("A is the Greatest Number");
		else if (b>a && b>c)
			System.out.println("B is the Greatest Number");
		else
			System.out.println("C is the Greatest Number");
	}

}
