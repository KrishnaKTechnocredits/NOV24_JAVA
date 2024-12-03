package pooja.inheritance;

public class Case5 {

	public static void main(String[] args) {

		Employee employee = new Employee();
		Manager manager = new Manager();
		employee = manager; // it is equivalent to case3 Employee employee = new Manager();
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.phone);
//		System.out.println(employee.dept);
//		System.out.println(employee.mName);
		System.out.println("--------------------------------");
		employee.display();// dynamic polymorphism
		employee.personalDetails();
//		employee.managerPersonalDetails();
	}
}