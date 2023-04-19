package Day1;
import java.util.Scanner;
public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sumEven=0,sumOdd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		for(int i = 1;i<=num;i++)
		{
			if(i%2==0)
			{
				sumEven = sumEven + i;
			}
			else
			{
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("Sum of Even Number = "+sumEven);
		System.out.println("Sum of odd Number = "+sumOdd);
	}

}
