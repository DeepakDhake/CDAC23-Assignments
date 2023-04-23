package com_D5.Day5;
public class Student {
	
//	Write a program to create student class with data members rollno, marks1,mark2,mark3.
//	Accept data (acceptInfo()) and display  using display member function.
//	Also display total,percentage and grade.
	private int rollno,marks1,marks2,marks3,total;
	private double perc;
	private char grade;
	
	public void acceptInfo(int rollno,int marks1,int marks2,int marks3) {
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	public void calculateMarks() {
		
		total = marks1 + marks2 + marks3;
		perc = ((total/300.00)*100);
		
		if(perc>=90 && perc<=100) {
			grade = 'A';
		}
		else if(perc>=70 && perc<=89) 
		{
			grade = 'B';
		}
		else if(perc>=60 && perc<=69) 
		{
			grade = 'C';
		}
		else if(perc>=40 && perc<=59) 
		{
			grade = 'D';
		}
		else
			grade = 'F';
	}
	
	public void displayInfo() {
		System.out.println("Total Marks = "+total+" Percentage = "+ perc+ " Grade = "+ grade);
	}
	

}
