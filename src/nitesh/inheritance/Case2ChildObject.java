/*
 * Case2: Shows members traverse from Parent to child and we can access Parent member by creating object of Child 
 */
package nitesh.inheritance;

public class Case2ChildObject {
	public static void main(String[] args) {
		EmployeeChildClass employeechildclass = new EmployeeChildClass();
		System.out.println(employeechildclass.x);//Child have same name variable so value always picked from child class
		System.out.println(employeechildclass.y);//Child have same name variable so value always picked from child class
		System.out.println(employeechildclass.z);//Parent variable invisibly there in child class

		employeechildclass.m1();//Parent method invisibly there in child class
		employeechildclass.m2();//Child have same name method so value always picked from child class
		employeechildclass.m3();//Method only present in child
	}

}
