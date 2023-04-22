package Day3;

public class Book {
	private String bname,author;
	private int id;
	private double price;
	
	
	public Book() {
		System.out.println("Default Constructor Called");
		bname = "ABCDE";
		author = "LMNOP";
		id = 100;
		price = 99.99;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBname() {
		return bname;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void display() {
	System.out.println("Book Name: "+bname);
	System.out.println("Author Name: "+author);
	System.out.println("Book ID: "+id);
	System.out.println("Book Price: Rs."+price);
	
	}
	
}
