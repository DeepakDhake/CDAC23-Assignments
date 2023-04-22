package PackageTestDay3;
import Day3.Point;
public class TesterPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.display();
		Point p2 = new Point(1,1);
		p2.display();
		Point p3 = new Point();
		p3.setX(3);
		p3.setY(3);
		p3.display();
	}

}
