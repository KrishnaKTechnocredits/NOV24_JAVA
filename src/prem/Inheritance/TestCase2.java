package prem.Inheritance;

public class TestCase2 {

	
	public static void main(String[] args) {    
		Employee employee =new Employee();      //Test case 2
		System.out.println(employee.name);
		System.out.println(employee.idEmp);
		System.out.println(employee.idMang);
		
		employee.nameDetail();
		employee.IdEmployee();
		employee.idManager();
		
	}
}
