package prem.Inheritance;

public class TestCase5 {
	
	public static void main(String[] args) {    
		Manager manager =new Manager();      //Test case 5
		Employee employee = new Employee();
		manager = employee;
		
		System.out.println(manager.name);
		System.out.println(manager.idMang);
	//	System.out.println(manager.idEmp);
		
		manager.nameDetail();
		manager.idManager();
	//	manager.IdEmployee();
		
	}

}
