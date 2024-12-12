package prem.Inheritance;

public class TestCase1 {
	
	public static void main(String[] args) {    
		Manager manager =new Manager();      //Test case 1
		System.out.println(manager.name);
		System.out.println(manager.idMang);
	//	System.out.println(manager.idEmp);   //can't access variable and method of child from Parent.
		
		manager.nameDetail();
		manager.idManager();
	//	manager.IdEmployee();
		
	}

}
