package pratik;

public class Employee {
	String empName = "Pratik Gaikwad";
	int empAge = 28;
	int empSalary = 25000;

	void displayEmpDetails() {
		System.out.println("Employee name : " + empName);
		System.out.println("Employee age : " + empAge);
		System.out.println("Employee salary : " + empSalary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayEmpDetails();
	}

}
