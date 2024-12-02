package prem.Inheritance;

public class TestClass6 {
	
	public static void main(String[] args) {  
		Manager manager = new Manager();            //Test case 6
		Employee employee =new Employee();          
	//  employee = manager;	                       // assigning value from child to parent variable is not allowed/possible. 
		
		System.out.println(employee.name);
		System.out.println(employee.idEmp);
		System.out.println(employee.idMang);
		
		employee.nameDetail();
		employee.IdEmployee();
		employee.idManager();
		
	}

}
