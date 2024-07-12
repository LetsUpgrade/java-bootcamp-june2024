package arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		/**
		 * Store marks of 5 subjects for 1 student
		 * sub1 = 1
		 * sub2 = 
		 * sub3
		 * a container where we can store more than 1 value
		 * Arrays 
		 * 1. are derived data type 
		 * 2. we define the size of the array
		 * 3. we can store values of same data type only
		 * 4. []
		 * 5. size is fixed
		 * 5 int value
		 * 4 bytes => 5*4 = 20 bytes
		 * 6. indexing
		 * 
		 * <datatype> <variablename>[] = new <datatype>[length]
		 * <datatype> []<variablename> = new <datatype>[length]
		 */
		int marks[] = new int[5];
		
		System.out.println(marks.length);// 0 to length-1
		marks[0] =100;
		System.out.println(marks[0]);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks for subject "+(i+1));
			marks[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			//System.out.println(marks[i]);
			total+=marks[i];
		}
		System.out.println(total);
		System.out.println(total/5);
	}
	

}
