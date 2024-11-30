package kishor.Inheritance;

public class Employee extends Manager{
	String role = "Assistant";
	String location = "pune";
	
	void companyRole() {
		System.out.println("I am :- "+role);
	}
	
	void workingLocation() {
		System.out.println("Location is:- "+location);
	}
}
