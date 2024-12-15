package pooja.inheritance;

public class Case2 {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
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