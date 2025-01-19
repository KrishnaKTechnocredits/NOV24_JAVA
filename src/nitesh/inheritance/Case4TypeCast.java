/*Case 4: In case four when we try to assign parent to child we get typecast compilation Error
 * because in left side of assigning operator class should be greater than or 
 * equal to right hand side class for implicit typecasting.
 */
package nitesh.inheritance;

public class Case4TypeCast {
	public static void main(String[] args) {
		//EmployeeChildClass managerparentclass = new ManagerParentClass();//Type mismatch: cannot convert from ManagerParentClass to EmployeeChildClass 
		EmployeeChildClass managerparentclass = new EmployeeChildClass();
		System.out.println(managerparentclass.x);
		System.out.println(managerparentclass.y);
		System.out.println(managerparentclass.z);

		managerparentclass.m1();
		managerparentclass.m2();
		managerparentclass.m3();
	}
}
