package kishor.Inheritance;

public class Case5 {
	
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		m=e; //-> this will be case 3 Manager m = new Employee
		System.out.println(m.name); //->call from parent class
		System.out.println(m.role); //->call from parent class,Variable property will not change
		//System.out.println(m.location); ->No guaranty from reference type at the time of compile->Location variable not available at Manager class
		m.managerName(); //->call from parent class as not available in employee class, so no behavior change
		m.companyRole(); //->call from employee class, at compile time it is from manager class and runtime it is from employee class
		//m.workingLocation(); ->No guaranty from reference type at the time of compile->WorkingLocation method not available at Manager class
		
	}
}
