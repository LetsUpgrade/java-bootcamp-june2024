package oops;
// template
public class StudentConstrtuctor {

	int rollno;
	String name;
	String email;
	/**
	 * 1. it is a special method with the name same as class name
	 * 2. used to initialize the data members of the class
	 * 3. they are called as soon as the object is created using new keyword
	 * 4. they do not have a return type
	 */
	
	StudentConstrtuctor(int r, String n){
		System.out.println("Constructor called");
		rollno=r;
		name =n;
		email = name+"@college.com";
	}
	void displayDetails()
	{
		System.out.println("Roll NO : "+rollno);
		System.out.println("Email : "+email);
		System.out.println("Name : "+name);
		
	}
}
