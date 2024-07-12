package entity;

public class Product {

	int pid;
	String name;
	String type;
	double price;
	int quantity;
	boolean inStock;
	public Product(int pid, String name, String type, double price, int quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		inStock = true;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity="
				+ quantity + ", inStock=" + inStock + "]";
	}
	
	
}
