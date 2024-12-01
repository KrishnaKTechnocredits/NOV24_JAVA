package anuja.allcase;

public class Case6 {

	public static void main(String[] args) {

		Manager manager = new Employee();
		Employee employee = new Employee();
		// employee=manager; // compilation error as child can not fit into parent
		// Employee employee = new Employee()
		employee = (Employee)manager;

		System.out.println("Its a case6 will work like case2 \n");
		System.out.println("x variable from class Employee-" + employee.x);
		System.out.println("y variable from class Employee- " + employee.y);
		System.out.println(employee.z);
		employee.m1();//from manager
		employee.m2();// m2 from class employee
		employee.m3();
		System.out.println(
				"m4 parametrised method from class Manager, its not common and object refers to class Manager");
		employee.m4(0);// m4 is also from class A
		employee.m4(); // non parametrised from class B

	}
}
