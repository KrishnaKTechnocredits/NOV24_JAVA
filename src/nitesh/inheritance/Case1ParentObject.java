/*
 * Case1: Members not traverse from child to parent so getting CE while trying to access members of child 
 */
package nitesh.inheritance;

public class Case1ParentObject {

	public static void main(String [] args) {
		ManagerParentClass managerparentclass = new ManagerParentClass();
		System.out.println(managerparentclass.x);
		System.out.println(managerparentclass.y);
		//System.out.println(managerparentclass.z);CE: z cannot be resolved or is not a field 
		managerparentclass.m1();
		managerparentclass.m2();
		//managerparentclass.m3();CE: The method m3() is undefined for the type ManagerParentClass
	}

}
