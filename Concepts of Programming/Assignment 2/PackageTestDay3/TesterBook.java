package PackageTestDay3;
import java.util.Scanner;

import Day3.Book;
public class TesterBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		b1.display();
		System.out.println("Enter Details to be updated");
		System.out.println("Enter Book Name: ");
		b1.setBname(sc.nextLine());
		System.out.println("Enter Author Name: ");
		b1.setAuthor(sc.nextLine());
		System.out.println("Enter Book Id: ");
		b1.setId(sc.nextInt());
		System.out.println("Enter Book Price: ");
		b1.setPrice(sc.nextDouble());
		b1.display();
	}

}
