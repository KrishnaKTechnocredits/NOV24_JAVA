package kishor.Inheritance;

public class Case6 {
	
	public static void main(String[] args) {
		Manager m = new Employee();
		Employee e = new Employee();
		e=(Employee)m;  //->this will be 2nd case Employee e = new Employee();, but we need to explicitly typecast
		System.out.println(e.name); //->call from parent class
		System.out.println(e.role); //->call from own class
		System.out.println(e.location); //->call from own class
		e.managerName(); //->call from parent class
		e.companyRole(); //->call from own class
		e.workingLocation(); //->call from own class
	}
}
