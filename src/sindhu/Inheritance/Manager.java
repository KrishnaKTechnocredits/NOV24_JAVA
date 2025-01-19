// Manager is a parent class

package sindhu.Inheritance;

public class Manager {
	int id = 7569;
	public String name = "Sindhu Patil";
	
	void getId(){
		System.out.println("Manager ID is "+id);
	}
	
	public void getName() {
		System.out.println("Manager Name is "+name);
	}
	
	void getDepartmentName(String deptName) {
		System.out.println("Manager Department is "+deptName);
	}
}
