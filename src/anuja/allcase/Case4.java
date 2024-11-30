package anuja.allcase;

public class Case4 {
	public static void main(String[] args) {
		System.out.println("This is case4, Employee employee = new Manager() \n");
		// Employee employee = new Manager();//shows compile error as parent can not fit
		// into child.
		System.out.println("Object cant be created as invalid mapping");
		/*
		 * System.out.println(employee.x); System.out.println(employee.y);
		 * System.out.println(employee.z); employee.m1(); employee.m2(); employee.m3();
		 * employee.m4(); //self local method of child as its different, signature is
		 * diff than class A m4 method employee.m4(10);//derived method from parent
		 * class as its signature is different so its new identity.
		 */

	}

}
