// Employee is a child class

package sindhu.Inheritance;

public class Employee extends Manager {
	int id = 2089;
	public String name = "Parag Puranik";
	int departmentId = 102;
	String departmentName = "Finance";
	
	void getId(){
		System.out.println("Employee ID is "+id);
	}
	
	public void getName() {
		System.out.println("Employee Name is "+name);
	}
	
	void getEmployeeDeptId() {
		System.out.println("Employee Department ID is "+departmentId);
	}
	
	void getDepartmentName() {
		System.out.println("Employee Department Name is "+departmentName);
	}
}
