package nitesh;

public class EmployeeDetails{
	String firstname = "Nitesh";
	String lastname = "Shukla";
	int age = 38;
	int salary = 32000;
	
	
	void employeeInfo() {
		System.out.println("Name of the Employee is => " +firstname + " "+ lastname);
		System.out.println("Employee Age => " +age);
		System.out.println("Employee Salary => " +salary);
	}
	public static void main(String[] args) {
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.employeeInfo();
			
	}
}
