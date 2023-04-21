package PackageTestDay3;
import java.util.Scanner;

import Day3.Date4;
public class TesterDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date4 obj1 = new Date4();
		obj1.displayDate();
		
		Date4 obj2 = new Date4(sc.nextInt(),sc.nextInt(),sc.nextInt());
		obj2.displayDate();
	}

}
