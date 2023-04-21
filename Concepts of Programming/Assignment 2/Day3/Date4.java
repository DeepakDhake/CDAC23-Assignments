package Day3;

public class Date4 {
	
	private int day,month,year;
	public Date4() {
		System.out.println("---inside Date class Default constr-----");
		day = 1;
		month = 1;
		year = 1970;
	}
	public Date4(int day,int month,int year)
	{
		System.out.println("-----inside Date Class Parameterised Constr----");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}

}
