package repository;

import java.util.ArrayList;

import entity.Product;

public class ProductItems {
	
	// collection of product
	// List
	ArrayList<Product> productList = new ArrayList<>();
	
	void addProduct(Product product) {
		productList.add(product);
	}
}
