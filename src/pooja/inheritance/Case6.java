package pooja.inheritance;

public class Case6 {

	public static void main(String[] args) {

		Employee employee = new Manager();
		Manager manager = new Manager();
		// manager=employee;//it is equivalent to case 2 Manager manager = new
		// Manager();
		// parent class can not fit/set into child class
		// need external type casting
		manager = (Manager) employee; // external type casting
		System.out.println(manager.id);
		System.out.println(manager.mName);
		System.out.println(manager.dept);
		System.out.println(manager.name);
		System.out.println(manager.phone);
		System.out.println("-----------------------");
		manager.display();
		manager.managerPersonalDetails();
		manager.personalDetails();
	}
}