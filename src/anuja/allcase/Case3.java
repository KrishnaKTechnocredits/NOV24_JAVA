package anuja.allcase;

public class Case3 {
	public static void main(String[] args) {
		Manager manager = new Employee();// object is created for class A(check just next to new keyword),
		System.out.println("Its a case3 \n");
		System.out.println("x variable from class Manager " + manager.x);
		System.out.println("y variable from class Manager " + manager.y);
		// System.out.println(manager.z);//compilation error
		manager.m1();
		manager.m2();// m2 from class A
		System.out.println(
				"m4 parametrised method from class Manager, its not common and object refers to class Manager");
		manager.m4(0);// m4 is also from class A
		// a.m4 not possible, compile error as its not common and non parametrised is
		// not present in A, its in B
		// a.m3();//compilation error,
	}
}
