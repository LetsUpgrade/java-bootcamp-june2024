package basic;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		/**
		 * ludo
		 * snake and ladders
		 * dice => 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dice value");
		int dice = sc.nextInt();
		//		if(dice==1) {
		//			System.out.println("move 1 step");
		//		}
		//		else if(dice==2) {
		//			System.out.println("move 2 steps");
		//		}
		//		else if(dice==3) {
		//			System.out.println("move 3 steps");
		//		}
		//		else if(dice==4) {
		//			System.out.println("move 4 steps");
		//		}
		//		else if(dice==5) {
		//			System.out.println("move 5 steps");
		//		}
		//		else if(dice==6) {
		//			System.out.println("move 6 steps");
		//		}
		//		else  {
		//			System.out.println("roll again");
		//		}
		switch(dice) {

		case 1: 
			System.out.println("move 1 step");
			break;
		case 2:
			System.out.println("move 2 steps");
			break;
		case 3: 
			System.out.println("move 3 steps");
			break;
		case 4:
			System.out.println("move 4 steps");
			break;
		case 5:
			System.out.println("move 5 steps");
			break;
		case 6:
			System.out.println("move 6 steps");
			break;
		default:
			System.out.println("roll again");
		}

	}

}
