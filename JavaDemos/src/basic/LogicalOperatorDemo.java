package basic;

import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number");
		int no = sc.nextInt();
		// no is divisible by 3 and 5
		// %(modulus)
		if(no%3==0 && no %5==0)// websites => username and password
		{
			System.out.println("yes it is divisible by 3 and 5");
		}
		// no is divisible by 3 or 5
		if(no%3==0 || no %5==0)// payment modes
		{
			System.out.println("yes it is divisible by 3 and 5");
		}
	}

}
