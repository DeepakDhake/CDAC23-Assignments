package Day1;
import java.util.Scanner;
public class Sumseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,out=0;
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 1; i<=num;i++)
		{
			out = out + i;
		}
		System.out.println("Sum of series upto "+num+" = "+out);
	}

}
