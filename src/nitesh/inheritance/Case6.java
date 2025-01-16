package nitesh.inheritance;

public class Case6 {
	public static void main(String[] args) {
		ManagerParentClass managerparentclass = new EmployeeChildClass();
		EmployeeChildClass employeechildclass = new EmployeeChildClass();
		employeechildclass = (EmployeeChildClass)managerparentclass;//External explicit Typecast using class child 
		System.out.println(employeechildclass.x);
		System.out.println(employeechildclass.y);
		System.out.println(employeechildclass.z);
		
		employeechildclass.m1();
		employeechildclass.m2();
		employeechildclass.m3();
	}
}
