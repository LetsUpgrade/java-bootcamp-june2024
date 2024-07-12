package basic;

import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = scanner.nextInt();
		System.out.println("Enter number 2");
		int b = scanner.nextInt();
		int sum = a+b;
		System.out.println(sum);
		// 10 + 20 = 30
		System.out.println(a+" + "+b+" = "+sum);
	}
}
