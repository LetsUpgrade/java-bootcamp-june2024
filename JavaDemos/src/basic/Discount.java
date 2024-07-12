package basic;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		/**
		 * Take amount as input
		 * apply 10% discount
		 * display the discount and discounted amount
		 */
		Scanner sc = new Scanner(System.in);// take input
		System.out.println("Enter amount");
		double amount = sc.nextDouble();
		double discount =  amount * 10/100;//amount * 0.1;
		double discamount = amount - discount;
		System.out.println("Discount "+discount );
		System.out.println("Discounted Amount "+discamount );
	}

}
