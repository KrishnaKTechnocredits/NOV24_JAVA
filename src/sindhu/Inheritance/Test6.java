/*  we create an object of class Employee (child) and assign it to both the reference variables a (of type A) and emp (of type Employee).	
 *  Next, we attempt to assign ‘mngr’ (which holds a reference to an object of class Employee) to the reference variable ‘emp’. However, this direct assignment would lead to a compilation error because we cannot assign a reference of the parent class (Manager) to a reference variable of the child class (Employee) without explicit type casting.
 
 *	Type Casting: To resolve this, we use explicit type casting: ‘(Employee)mngr’. This casts the parent reference ‘mngr’ to the child class type Employee, making it compatible with the reference variable ‘emp’.
 *	After performing the type casting, the assignment is valid, and no errors will occur.
*/
package sindhu.Inheritance;

public class Test6 {
	public static void main(String[] args){
		Manager mngr = new Employee();
		Employee emp = new Employee();
		emp =(Employee) mngr; //i.e. Employee emp = new Employee(); -> Type casting
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.departmentId);
		System.out.println(emp.departmentName);
		System.out.println(' ');
		emp.getId();
		emp.getName();
		emp.getDepartmentName("IT");
		emp.getEmployeeDeptId();
		emp.getDepartmentName();
	}
	
}
