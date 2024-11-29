package anuja;
/*Create a class called Employee having employee name , employee age, employee salary. and print them.
*/
public class Assignment1 {
	
	void getEmployeeDetails() {
		String EmployeeName = "Anuja";
		int EmployeeAge = 40;
		String EmployeeSalary = "30000 Rs/Month";
		System.out.println("Name is "+ EmployeeName + " and Age is " + EmployeeAge +" . \n ");
		System.out.println("Employee salary is "+ EmployeeSalary + ".");
	}
	
	public static void main(String[] args) {
		Assignment1 assignment1= new Assignment1();
		assignment1.getEmployeeDetails();
	}

}
