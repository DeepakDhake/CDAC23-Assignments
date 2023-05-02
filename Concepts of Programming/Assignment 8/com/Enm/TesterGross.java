package com.Enm;

import java.util.Scanner;

public class TesterGross {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		int index = 0;
		Product[] pd = new Product[5];
		char ch;
		do {
			System.out.println("a: Add new products\r\n" + "b: Display all products\r\n"
					+ "c: Show specific product by id\r\n" + "d: Show all product price >100\r\n"
					+ "e: Accept category from user and show only matched products"
					+ "f: To Exit");
			str = sc.next().toLowerCase();
			ch = str.charAt(0);
			switch (ch){
			case 'a':
				if(index < pd.length)
				{
					System.out.println("Enter Id, Name of Product, Price, category");
					pd[index++] = new Product(sc.nextInt(),sc.next(),sc.nextDouble(),CategoryGross.valueOf(sc.next().toUpperCase()));
					System.out.println("Added Product Successfully");
				}
				else
				{
					System.out.println("Array is Full");
				}
				break;
			case 'b':
				for(Product products : pd)
				{
					if(products != null)
					{
						System.out.println(products);
					}
				}
				break;
			case 'c':
				int prod;
				System.out.println("Enter Id of Product: ");
				prod = sc.nextInt();
				for(Product products : pd)
				{
					if(products != null)
					{
						if(products.getId() == prod)
						{
							System.out.println(products);
						}
					}
				}
				break;
			case 'd':
				for(Product products : pd)
				{
					if(products != null)
					{
						if(products.getPrice() > 100)
						{
							System.out.println(products);
						}
					}
				}
				break;
			case 'e':
				CategoryGross cat;
				System.out.println("Enter Category: ");
				cat = CategoryGross.valueOf(sc.next().toUpperCase());
				for(Product products : pd)
				{
					if(products != null)
					{
						if(products.getCat() == cat)
						{
							System.out.println(products);
						}
					}
				}
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (ch != 'f');
		sc.close();
	}

}
