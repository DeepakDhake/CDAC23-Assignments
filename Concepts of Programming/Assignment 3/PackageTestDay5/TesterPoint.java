package com_D5.PackageTestDay5;
import com_D5.Day5.Point;
import java.util.Scanner;
public class TesterPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		p1.display();
		Point p2 = new Point(1,1);
		p2.display();
		Point p3 = new Point();
		System.out.println("Update X: ");
		p3.setX(sc.nextInt());
		System.out.println("Updated X = "+p3.getX());
		System.out.println("Updated Y: ");
		p3.setY(sc.nextInt());
		System.out.println("Updated Y = "+p3.getY());
		p3.display();
	}

}
