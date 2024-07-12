package oops;
// template
public class Student {

	// rno, name , email
	int rollno;
	String name;
	String email;
	// methods -> reusable piece of code
	/**
	 * returntype methodname(0 or more parameters){
	 *  	// block of code this method
	 *  does
	 * }
	 */
//	void setDetails() {
//		rollno = 1;
//		name = "Shalini";
//		email = name+"@college.com";
//	}
	// needs input
	// just to initialize the data for the clas
	void setDetails(int r, String n) {
		rollno = r;
		name = n;
		email = name+"@college.com";
	}
}
