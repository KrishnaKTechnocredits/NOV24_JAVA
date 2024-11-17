package deepali;

//Program to print employee details
public class EmployeeDetails {
	String empName = "Deepali";
	int empAge = 30;
	int empSalary = 1500;
	
	void displayEmployeeInfo() {
		System.out.println("Employee name : " + empName );
		System.out.println("Employee age : " + empAge );
		System.out.println("Employee salary : " + empSalary );
	}
	
	public static void main(String[] args) {
		EmployeeDetails assignment = new EmployeeDetails();
		assignment.displayEmployeeInfo();
	}
}
