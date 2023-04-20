package Day1;

import java.util.Scanner;

public class MenuDrivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size,choice;
		int [] arr;
		System.out.println("Enter the size of Array to be created");
		size = sc.nextInt();
		arr = new int[size];
		do
		{
			System.out.println("\n1:Read Array \n2:Print Array \n3:Search element in array \n4:Reverse Array \n5:Even number from array \n6:sum of array element\n0:Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Array Created For storing "+arr.length+"  Numbers");
				System.out.println("Enter the elements in Array");
				for(int i = 0; i<arr.length;i++) {
					arr[i] = sc.nextInt();
				}
				break;
			case 2:
				for(int i = 0; i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				break;
			case 3:
				System.out.println("Enter the Element to be searched in Array: ");
				int num;
				boolean flag = false;
				num = sc.nextInt();
				for(int i = 0; i<arr.length;i++) {
					if(num == arr[i])
					{
						flag = true;
					}
				}
				if(flag == true)
				{
					System.out.println("Element is Present");
				}
				else
				System.out.println("Element Not Present");
				break;
			case 4:
				for(int i = arr.length-1; i>=0;i--) {
					System.out.print(arr[i]+" ");
				}
				break;
			case 5:
				for(int i = 0; i<arr.length;i++) {
					if(arr[i]%2 == 0)
					{
						System.out.print(arr[i]+" ");
					}
				}
				break;
			case 6:
				int sum = 0;
				for(int i = 0; i<arr.length;i++) {
					sum = sum + arr[i];
				}
				System.out.println("Sum of Array elements = "+sum);
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}while(choice != 0);
			
	}

}
