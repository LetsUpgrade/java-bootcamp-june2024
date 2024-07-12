package basic;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		/**
		 * voting
		 * If age above 18 can vote else cannot vote
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		/**
		 * Relational operators 
		 * < > <= >= == != used generally with conditional expressions
		 * if (condition){
		 * 
		 *	code to execute if the condition is true
		 *}
		 *else{
		 *	code to execute if the condition is false
		 *}
		 */
		if (age >= 18) {
			System.out.println("Can vote");
		}
		else {
			System.out.println("Cannot vote");
		}
		System.out.println("Enter a number");
		int no = sc.nextInt();
		if(no>0) {
			System.out.println("positive");
		}
		else if(no < 0) {
			System.out.println("negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}

}
