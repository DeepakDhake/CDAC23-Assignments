package tester;

import java.util.Scanner;
import com.cdac.geometry.Point2D;

public class TestPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points to plot enter value: ");
		int size = sc.nextInt();
		Point2D[] pts = new Point2D[size];
		for (int i = 0; i < pts.length; i++) {
			System.out.println("Enter x-coordinate of point " + (i+1));
			double x = sc.nextDouble();
			System.out.println("Enter y-coordinate of point " + (i+1));
			double y = sc.nextDouble();
			pts[i] = new Point2D(x, y);
		}

		System.out.println("All points plotted so far:");
		for (Point2D pt : pts) {
			System.out.println(pt.show());
		}

		System.out.print("Enter index of first point: ");
		int index1 = sc.nextInt();
		System.out.print("Enter index of second point: ");
		int index2 = sc.nextInt();

		if (pts[index1].isEqual(pts[index2])) {
			System.out.println("The two points are the same.");
		} else {
			System.out.println("The two points are different.");
			double distance = pts[index1].calculateDistance(pts[index2]);
			System.out.println("Distance between the two points: " + distance);
		}

	}
}
