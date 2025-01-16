package nitesh.inheritance;

public class Case5 {
	public static void main(String[] args) {
		ManagerParentClass managerparentclass = new ManagerParentClass();
		EmployeeChildClass employeechildclass = new EmployeeChildClass();
		managerparentclass = employeechildclass;// here we are assingning value holds by childclass to parent i.e members of class Parents(Similar to dynamic Polymorphism)
	
		System.out.println(managerparentclass.x);
		System.out.println(managerparentclass.y);
		System.out.println(managerparentclass.z);
		
		managerparentclass.m1();
		managerparentclass.m2();
		//managerparentclass.m3();//Same like Dynamic polymorphism not able to see the m3 as it is not present in Parent class
	}
}
