package pooja.inheritance;

public class Manager extends Employee {
	int id = 10;
	String dept = "IT", mName = "Aarti";

	void display() {
		System.out.println("Department :" + dept);
		System.out.println("Manager Id : " + id);
	}

	void managerPersonalDetails() {
		System.out.println("Manage name :" + mName);
	}
}