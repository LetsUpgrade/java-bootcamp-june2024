package inheritance;
// parent or super or base
/**
 * abstract 
 * 1. it is access modifier
 * 2. abstract classes cannot be instantiated
 * 3. they can have constructors
 * 
 * @author Shalini
 *
 */
public abstract class Item {

	int id;
	String description;
	double price;
	String name;
	public Item() {
		System.out.println("Item def constructor");
	}
	public Item(int id, String description, double price, String name) {
		System.out.println("Item constructor");
		this.id = id;
		this.description = description;
		this.price = price + 0.1*price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", price=" + price + ", name=" + name + "]";
	}
	
	double calculateMrp(double taxprec) {
		double mrp = price + price * taxprec/100;
		return mrp;
	}
}
