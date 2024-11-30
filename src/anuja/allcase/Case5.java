package anuja.allcase;

public class Case5 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee employee = new Employee();
		manager = employee;//Manager manager = new Employee();

		System.out.println("Its a case5 is same as case3 \n");
		System.out.println("x variable from class Manager " + manager.x);
		System.out.println("y variable from class Manager " + manager.y);
		//System.out.println(manager.z);//compilation error
		manager.m1();
		manager.m2();// m2 from class A
		System.out.println(
				"m4 parametrised method from class Manager, \n its not common and object refers to class Manager");
		manager.m4(0);// m4 is also from class A
		//manager.m4// not possible, compile error as its not common and its from class B
		//manager.m3();//compilation error,
	}
}
