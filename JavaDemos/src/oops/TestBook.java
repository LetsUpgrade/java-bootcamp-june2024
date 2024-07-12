package oops;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// array of objects

		Book books[] = new Book[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < books.length; i++) {
			System.out.println("Book "+(i+1)+" Details");
			System.out.println("Enter title");
			String title = sc.next();
			System.out.println("Enter author");
			String author = sc.next();
			System.out.println("Enter genre");
			String genre = sc.next();
			System.out.println("Enter price");
			double price = sc.nextDouble();
			books[i] = new Book(title, genre, author, price);
		}
		System.out.println("Details of the book entered");
		for (int i = 0; i < books.length; i++) {
			books[i].display();
		}
		System.out.println(books[0].toString());

	}

}
