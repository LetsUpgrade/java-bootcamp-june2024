package oops;
/**
 * 
 *
 */
public class Book {
	String title;
	String genre;
	String author;
	double price;
	// taking input
	public Book(String title, String genre, String author, double price) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}
	double calculateMrp() {
		double mrp = price + price * 0.08;
		return mrp;
	}
	void display() {
		System.out.println(title);
		System.out.println(genre);
		System.out.println(author);
		System.out.println(calculateMrp());
		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + ", author=" + author + ", price=" + price + "]";
	}
	
}
