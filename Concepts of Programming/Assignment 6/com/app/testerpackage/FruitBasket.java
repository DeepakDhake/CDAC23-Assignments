package com.app.testerpackage;

import com.app.fruits.*;
import java.util.*;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Basket");
		Fruit[] arr = new Fruit[sc.nextInt()];
		int ch;
		int index = 0;
		do {
			System.out.println("1. ADD MANGO \n2. ADD ORANGE \n3. ADD APPLE" + "\n4. Display All Fruits"
					+ "\n5. Display Fresh fruits Only" + "\n6. Mark As Stale" + "\n7. Mark All Sour Fruits Stale"
					+ "\n8. Specific Functionality" + "\n9. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < arr.length) {
					System.out.println("Enter Name Colour Weight");
					arr[index++] = new Mango(sc.next(), sc.next(), sc.nextDouble(), true);
					System.out.println("Mango Added to Basket");
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 2:
				if (index < arr.length) {
					System.out.println("Enter Name Colour Weight");
					arr[index++] = new Orange(sc.next(), sc.next(), sc.nextDouble(), true);
					System.out.println("Orange Added to Basket");
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 3:
				if (index < arr.length) {
					System.out.println("Enter Name Colour Weight");
					arr[index++] = new Apple(sc.next(), sc.next(), sc.nextDouble(), true);
					System.out.println("Apple Added to Basket");
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 4:
				for (Fruit f : arr) {
					if (f != null) {
						System.out.println(f);
					}
				}
				break;
			case 5:
				for (Fruit f : arr) {
					if (f != null) {
						if (f.isFresh()) {
							System.out.println("Name: " + f.getName() + " Color: " + f.getColor() + " Weight: "
									+ f.getWeight() + " Taste: " + f.taste());
						}
					}
				}
				break;
			case 6:
				int i;
				System.out.println("Enter Index: ");
				i = sc.nextInt();
				System.out.println("You Selected " + arr[i].getName());
				if (arr[i].isFresh()) {
					arr[i].setFresh(false);
					System.out.println(arr[i].getName() + " marked as Stale");
				} else {
					System.out.println("Invalid Index Entered");
				}
				break;
			case 7:
				for (Fruit f : arr) {
					if (f != null) {
						if (f.taste().equals("sour")) {
							f.setFresh(false);
						}
					}
				}
				break;
			case 8:
				int in;
				System.out.println("Enter Index: ");
				in = sc.nextInt();
				System.out.println("You Selected " + arr[in].getName());

				if (arr[in] instanceof Mango) {
					((Mango) arr[in]).pulp();
				} else if (arr[in] instanceof Orange) {
					((Orange) arr[in]).juice();
				} else if (arr[in] instanceof Apple) {
					((Apple) arr[in]).jam();
				} else {
					System.out.println("Invalid Index Entered");
				}

				break;
			case 9:
				System.out.println("Exiting>>>>>>>>>>");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while (ch != 9);

	}

}
