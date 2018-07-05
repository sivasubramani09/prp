package encapsulation;

class Author{
	private String name;
	private String email;
	private char gender;
	public Author() {}
	public Author(String n,String e,char c) {
		name = n;
		email =e;
		gender = c;
	}
	@Override
	public String toString() {
		return ("Author name: "+name+",\nEmail: "+email+",\nGender: "+gender);
	}
}
class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book() {
		name="Five Point Someone";
		author = new Author("Chetan Bhagat", "feedback@chetan.com", 'M');
		price=0;
		qtyInStock=0;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	
}
public class En1 {
	public static void main(String[] args) {
		Book myFirstBook = new Book(); //An instance is created for the class Book;
		myFirstBook.setPrice(275);
		myFirstBook.setQtyInStock(100); 
		System.out.println("Book name: "+myFirstBook.getName()+"\nPrice: "+myFirstBook.getPrice()+"\nQtyInStock: "+myFirstBook.getQtyInStock());
		System.out.println(myFirstBook.getAuthor()); 
		/*
		 * getAuthor returns the object of Class Author.
		 * When the object is printed,the override toString() method is printed.
		 * */
	}
}
