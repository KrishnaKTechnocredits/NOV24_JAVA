/* •	Assignment - 1 : 9th Nov'2024
Create a class called Employee having employee name , employee age, employee salary. and print them.
*/

package nikita.basicdemo;

public class Assignment01 {
	
	String ename = "Nikita";
	int eage = 27;
	int esalary = 60000;
	
	void displayInfo() {
		System.out.println("Employee Name is: " + ename);
		System.out.println("Employee Age is: " + eage);
		System.out.println("Employee Salary is: " + esalary);
	}

	public static void main(String[] args) {
		Assignment01 a01 = new Assignment01();
		a01.displayInfo();

	}

}
