package kishor.Inheritance;

public class Case1 {
	
	public static void main(String[] args) {
		Manager m = new Manager();
		System.out.println(m.name);
		System.out.println(m.role);
		//System.out.println(m.location);->not able to access as variable not available in Manager reference type
		m.managerName();
		m.companyRole();
		//m.workingLocation; ->not able to access as method not available in Manager reference type
	}
}
