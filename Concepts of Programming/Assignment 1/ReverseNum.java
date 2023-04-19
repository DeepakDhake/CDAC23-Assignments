package Day1;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		num = sc.nextInt();
		while(num!=0) {
			num2 = num%10;
			System.out.print(num2);
			num = num /10;	
		}
	}
}
