package com_D5.PackageTestDay5;
import com_D5.Day5.Student;
import java.util.Scanner;
public class TesterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	Student s1 = new Student();
	int rollno = 0;
	int marks1 = 0;
	int marks2 = 0;
	int marks3 = 0;
	System.out.println("Enter your Rollno. ");
	rollno = sc.nextInt();
	System.out.println("Enter Subject 1 Marks");
	marks1 = sc.nextInt();
	if(marks1>100) {
		System.out.println("Invalid Marks");
		System.exit(0);
	}
	System.out.println("Enter Subject 2 Marks");
	marks2 = sc.nextInt();
	System.out.println("Enter Subject 3 Marks");
	marks3 = sc.nextInt();
	
	s1.acceptInfo(rollno,marks1,marks2,marks3);
	
	s1.calculateMarks();
	s1.displayInfo();
		
	}

}
