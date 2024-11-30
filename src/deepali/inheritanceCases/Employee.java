package deepali.inheritanceCases;

public class Employee extends Manager {
	int id = 80;
	int empSalary = 20000;

	void getEmpDetails() {
		System.out.println("emp2");
	}

	void display() {
		System.out.println("Employee display");
	}
}
