package basic;

import java.util.Scanner;

public class HotelMS {

	public static void main(String[] args) {
		/**
		 * take name and no of days a customer will stay in a hotel
		 * if no of days is more than 5 give 15% discount
		 * cost is 2500 per day
		 */
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter no of days");
		int days = sc.nextInt();
		double discount = 0;
		int totalamount = days * 2500;
		if(days>=5) {
			discount = 0.15 * totalamount;
		}
		double discamount = totalamount - discount;
		System.out.println("Name "+name);
		System.out.println("Days "+days);
		System.out.println("Total Amount "+totalamount);
		System.out.println("Discount "+discount);
		System.out.println("Amount after discount "+discamount);
	}

}
