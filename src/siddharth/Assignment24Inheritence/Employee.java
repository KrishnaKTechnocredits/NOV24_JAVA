package siddharth.Assignment24Inheritence;

public class Employee extends Manager {
	int id = 1234;
	public String name = "ABC";
	int departmentId = 50;
	String departmentName = "Quality Assurance";

	void getId(){
		System.out.println("Employee ID is "+id);
	}

	public void getName() {
		System.out.println("Employee Name is "+name);
	}

	void getEmployeeDeptId() {
		System.out.println("Employee Department ID is "+departmentId);
	}

	void getDepartmentName() {
		System.out.println("Employee Department Name is "+departmentName);
	}
}
