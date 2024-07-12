package inheritance;
// child or sub or derived
public class Book extends Item{

	String author;
	public Book() {
		System.out.println("Book def constructor");
	}
	public Book(int id, String description, 
			double price, String name,
			String author) {
		// super is used to call the constructor of the immediate parent class
		super(id, description, price, name);
		System.out.println("Book constructor");
		this.author = author;
	}
	
}
