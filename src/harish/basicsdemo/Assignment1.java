package harish.basicsdemo;

/**
 * Assignment - 1 : 9th Nov'2024
 * 
 * Create a class called Employee having employee name , employee age, employee
 * salary and print them
 */

public class Assignment1 {

	String empName;
	int empAge;
	int empSalary = 4000;

	void displayEmpDetails() {
		System.out.println(empName);
		System.out.println(empAge);
		System.out.println(empSalary);
	}

	void update() {
		empAge = 15;
	}

	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.displayEmpDetails();
		assignment1.update();
		assignment1.displayEmpDetails();
	}
}
