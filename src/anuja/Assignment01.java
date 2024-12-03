package anuja;
/*Create a class called Employee having employee name , employee age, employee salary. and print them.
*/
public class Assignment01 {
	
	void getEmployeeDetails() {
		String EmployeeName = "Anuja";
		int EmployeeAge = 40;
		String EmployeeSalary = "30000 Rs/Month";
		System.out.println("Name is "+ EmployeeName + " and Age is " + EmployeeAge +" . \n ");
		System.out.println("Employee salary is "+ EmployeeSalary + ".");
	}
	
	public static void main(String[] args) {
		Assignment01 assignment01= new Assignment01();
		assignment01.getEmployeeDetails();
	}

}
