package loops;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		//loops - repeat some functionality again and again
		/**
		 * where to start, when to stop and an update value to move
		 * from start to stop
		 * for => exact number of times you want to run aprogram
		 * while
		 * do-while
		 */
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		// while -> when we dont know how many times to run
		// ask the user to enter a 2-digit number and if it is not
		// a 2-digit number continue asking to enter
		/**
		 * start
		 * while(condition){
		 * // do something
		 * } 
		 */
		Scanner sc = new Scanner(System.in);
		int no = 0;
		while(no<10 || no>99)// 29 
		{
			System.out.println("Please enter a 2-digit number");
			no= sc.nextInt();
			
		}
		// check if the number has both digits same
		if(no%11==0) {
			System.out.println(no + " has both digits same");
		}
		else {
			System.out.println(no + " does not has both digits same");
		}
		// do-while : when you want to run the loop atleast once
		int choice = 0;
		do {
			// display a menu for user to choose
			System.out.println("Choose");
			System.out.println("1. Add");
			System.out.println("2 . Sub");
			System.out.println("3. Exit");
			choice = sc.nextInt();
		}while(choice!=3);
	}

}
