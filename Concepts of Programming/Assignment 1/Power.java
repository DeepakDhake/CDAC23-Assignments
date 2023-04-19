package Day1;
import java.util.Scanner;
public class Power {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,out=1;
		System.out.println("Enter base: ");
		m = sc.nextInt();
		System.out.println("Enter power: ");
		n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			out = out*m;
		}
		
		System.out.println("m raise to n = "+out);
	}
	
}
