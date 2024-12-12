package pooja.inheritance;

public class Case3 {

	public static void main(String[] args) {
		
		Employee employee = new Manager();
		System.out.println(employee.id);
//		System.out.println(employee.dept);
//		System.out.println(employee.mName);
		System.out.println(employee.name);
		System.out.println(employee.phone);
		System.out.println("-------------------------");
		employee.display();// Dyanamic Polymorphism
		employee.personalDetails();
//		employee.managerPersonalDetails(;)
	}
}