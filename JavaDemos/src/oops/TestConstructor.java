package oops;

public class TestConstructor {

	public static void main(String[] args) {
		StudentConstrtuctor s1 =
				new StudentConstrtuctor(1, "Sai");
		
		StudentConstrtuctor s2 =
				new StudentConstrtuctor(10, "Pavan");
		
		s1.displayDetails();
		s2.displayDetails();
	}
}
