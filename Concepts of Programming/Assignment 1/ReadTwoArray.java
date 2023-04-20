package Day1;
import java.util.Scanner;
public class ReadTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size1,size2;
		int [] arr1;
		int [] arr2;
		int [] arr3;
		System.out.println("Enter the size of 1st Array: ");
		size1 = sc.nextInt();
		arr1 = new int[size1];
		System.out.println("Enter the elements of array: ");
		for(int i = 0; i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of 2nd Array: ");
		size2 = sc.nextInt();
		arr2 = new int[size2];
		for(int i = 0; i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		arr3 = new int[arr1.length+arr2.length];
		
		for(int i = 0; i<arr1.length;i++)
		{
			arr3[i] = arr1[i];
		}
		for(int i = 0 ; i<arr2.length;i++)
		{
			arr3[i+arr1.length] = arr2[i];
		}
		
		for(int i = 0 ; i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}

}
