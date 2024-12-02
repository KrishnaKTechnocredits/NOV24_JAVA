package pooja.inheritance;

public class Employee {
	int id = 20;
	String name = "Pooja", phone = "9881457696";

	void display() {
		System.out.println("Employee Name :" + name);
		System.out.println("Employee Id : " + id);
	}

	void personalDetails() {
		System.out.println("Employee Contact Number :" + phone);
	}
}