package kishor.Inheritance;

public class Case2 {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.name); //->call from parent class
		System.out.println(e.role); //->call from own class
		System.out.println(e.location); //->call from own class
		e.managerName(); //->call from parent class
		e.companyRole(); //->call from own class
		e.workingLocation(); //->call from own class
	}
}
