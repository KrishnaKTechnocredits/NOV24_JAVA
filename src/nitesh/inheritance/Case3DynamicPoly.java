/*Case3: If there are exactly two similar methods in both the class than compiler took
 * guarantees from left end side class from referencetype(ManagerParentClass(parent))class and executes the method    
 * from right side(child class(EmployeeChildClass)).This phenomina is called as Dynamic Polymorphism 
 */
package nitesh.inheritance;

public class Case3DynamicPoly {
	public static void main(String[] args) {
		ManagerParentClass employeechildclass = new EmployeeChildClass(); 
		System.out.println(employeechildclass.x);//Values of variable picked from parent or left side class from object
		System.out.println(employeechildclass.y);//Values of variable picked from parent or left side class from object
		System.out.println(employeechildclass.z);//Values of variable picked from parent or left side class from object
		//System.out.println(managerparentclass.a);//Child class variables are not accessible in this case,CE: a cannot be resolved or is not a field

		employeechildclass.m1();// Executed from left side class
		employeechildclass.m2();//Due to same method Took guarantees from left side class and executed right side class method
		//managerparentclass.m3();//The method m3() is undefined for the type ManagerParentClass
	}
}
