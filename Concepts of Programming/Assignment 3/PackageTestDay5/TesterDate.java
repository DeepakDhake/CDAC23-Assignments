package com_D5.PackageTestDay5;
import com_D5.Day5.Date;
import java.util.Scanner;
public class TesterDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		d1.displayDate();
		Date d2 = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		d2.displayDate();
		System.out.println("Enter the day to be updated: ");
		d1.setDay(sc.nextInt());
		System.out.println("Enter the day to be updated: ");
		d1.setMonth(sc.nextInt());
		System.out.println("Enter the day to be updated: ");
		d1.setYear(sc.nextInt());
		
		System.out.println("New Date: "+d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
	}

}
