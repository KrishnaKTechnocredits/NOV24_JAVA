/*	In this scenario, the reference variable mngr is of reference type Manager(parent), but the object it refers to is of type Employee (child).
	At compile time, the compiler checks the properties of class Manager, which means it cannot access the variables (departmentId and departmentName) and the methods (getEmployeeDeptId() and getDepartmentName()) from class Employee.
	However, at runtime, the actual method getId() and getName() from class Employee is called because of dynamic polymorphism.
*/

package sindhu.Inheritance;

public class Test3 {
	public static void main(String[] args){
		Manager mngr = new Employee();
		
		System.out.println(mngr.id);
		System.out.println(mngr.name);
		//System.out.println(mngr.departmentId);
		//System.out.println(mngr.departmentName);
		System.out.println(' ');
		mngr.getId();
		mngr.getName();
		mngr.getDepartmentName("IT");
		//mngr.getEmployeeDeptId();
		//mngr.getDepartmentName();
	}
}
