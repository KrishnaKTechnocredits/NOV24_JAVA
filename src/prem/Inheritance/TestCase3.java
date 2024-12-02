package prem.Inheritance;

public class TestCase3 {
	
	public static void main(String[] args) {    
		Manager manager =new Employee();      //Test case 3
		System.out.println(manager.name);
		System.out.println(manager.idMang);
   // 	System.out.println(manager.idEmp);
		
		manager.nameDetail();
		manager.idManager();
  //	manager.IdEmployee();
		
	}

}
