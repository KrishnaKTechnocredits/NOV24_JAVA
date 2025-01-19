/* The Employee class class (child)can access all Properties
* of Manager class(parent) and Variable id, name 
* and method getName(),getId() are overriding on Manager class */

package sindhu.Inheritance;

public class Test2 {
	public static void main(String[] args){
		Employee emp = new Employee();
		
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
