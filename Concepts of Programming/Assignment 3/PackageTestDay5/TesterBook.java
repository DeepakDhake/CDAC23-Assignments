package com_D5.PackageTestDay5;
import java.util.Scanner;
import com_D5.Day5.Book;
public class TesterBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		b1.display();
		System.out.println("Enter Details to be updated");
		System.out.println("Enter Book Name: ");
		b1.setBname(sc.nextLine());
		System.out.println("Updated Book Name: "+b1.getBname());
		System.out.println("Enter Author Name: ");
		b1.setAuthor(sc.nextLine());
		System.out.println("Updated Book Name: "+b1.getAuthor());
		System.out.println("Enter Book Id: ");
		b1.setId(sc.nextInt());
		System.out.println("Updated Book Name: "+b1.getId());
		System.out.println("Enter Book Price: ");
		b1.setPrice(sc.nextDouble());
		System.out.println("Updated Book Price: "+b1.getPrice());
		b1.display();
	}

}

