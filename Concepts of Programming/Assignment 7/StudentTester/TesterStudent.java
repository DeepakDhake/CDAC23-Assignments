package com.StudentTester;

import com.Student.student;
import java.util.Scanner;

public class TesterStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student[] s = new student[5];
		int choice;
		int index = 0;
		do {
			System.out.println("Enter Choice ");
			System.out.println("1. Add Student");
			System.out.println("2. Edit Address");
			System.out.println("3. Display Student");
			System.out.println("0. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (index < s.length) {
					boolean duplicateRoll = false;
					int roll;
					System.out.println("Enter RollNo.: ");
					roll = sc.nextInt();
					for (int i = 0; i < index; i++) {
						if (s[i].getRollno() == roll) {
							System.out.println("Duplicate Rollno entered");
							duplicateRoll = true;
							break;
						}
					}
					if(!duplicateRoll) {
						System.out.println("Enter Name,Address,Email");
						s[index] = new student(roll, sc.next(), sc.next(), sc.next());
						index++;
						System.out.println("Student added successfully!");
					}
				} else {
					System.out.println("Array Full");
				}
				break;
			case 2:
				System.out.println("Enter your RollNo: ");
				int id = sc.nextInt();
				boolean flag2 = false;
				for (int i = 0; i < index; i++) {
					if (id == s[i].getRollno()) {
						flag2 = true;
						System.out.println("Enter the address to be updated: ");
						s[i].setAddress(sc.next());
						System.out.println("Updated Address: " + s[i].getAddress());
					}
				}
				if (!flag2) {
					System.out.println("Enter Valid ID");
				}
				break;
			case 3:
				System.out.println("Enter Your ID ");
				id = sc.nextInt();
				boolean flag3 = false;
				for (int i = 0; i < index; i++) {
					if (s[i].getRollno() == id) {
						flag3 = true;
						System.out.println(s[i]);
						break;
					}
				}
				if (!flag3) {
					System.out.println("Not Found");
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 0);
		sc.close();
	}
}
