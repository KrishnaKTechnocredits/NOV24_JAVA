package komal.Inheritance;

public class Manager {
	String companyName = "Techo";
	String name;
	String salary;
	String department = "Automation Engineer";

	public void getDetails() {
		this.name = "vishal";
		this.salary = "500000";
		System.out.println("Manager Name is " + name);
	}

	public static void main(String[] args) {
		Manager manager = new Manager(); // case 1

		manager.getDetails();
		System.out.println("department : " + manager.department + manager.companyName);
	}
}
