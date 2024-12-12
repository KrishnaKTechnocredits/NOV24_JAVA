package pooja.inheritance;

public class Case1 {

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.phone);
		System.out.println("--------------------");
		// System.out.println(emp.mName);
		// System.out.println(emp.dept);
		emp.display();
		// emp.managerPersonalDetails();
		emp.personalDetails();
	}
}