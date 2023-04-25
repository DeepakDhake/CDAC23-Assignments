package com_D5.PackageTestDay5;

import java.util.Scanner;

import com_D5.Day5.NewStudent;

public class TesterNewStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		  NewStudent s1 = new NewStudent("Deepak","Jalgaon"); s1.display(); NewStudent
		  s2 = new NewStudent("Sahil","Nagpur"); s2.display(); NewStudent s3 = new
		  NewStudent("John Wick","US"); s3.display(); NewStudent s4 = new
		  NewStudent("Harry Potter","Hogwarts"); s4.display(); NewStudent s5 = new
		  NewStudent("Ron Wiesely","Hogwarts"); s5.display();
		 
//		NewStudent stud[] = new NewStudent[5];
//		for(int i = 0; i<stud.length;i++) {
//			System.out.println("Enter your name and address ");
//			stud[i] = new NewStudent(sc.next(), sc.next());
//			stud[i].display();
//		}
//		
//		for(NewStudent s: stud) {
//			System.out.println("\n");
//			System.out.println(s.getName());
//		}
//				
		}
		
		
	}
