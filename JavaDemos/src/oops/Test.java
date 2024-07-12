package oops;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setDetails(1, "Valencia");
		
//		s1.rollno = 1;
//		s1.name = "Shalini";
//		s1.email ="shalini@gmail.com";
		
		System.out.println(s1.name);
		Student s2 = new Student();
		s2.setDetails(2,"Pavan");
//		s2.rollno = 2;
//		s2.name = "Arjun";
//		s2.email ="arjun@gmail.com";
		
		System.out.println(s2.name);
		System.out.println(s1.email);
		System.out.println(s2.email);
	}

}
