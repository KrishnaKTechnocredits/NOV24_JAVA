package fazrana.inheritanceAss24;

public class Employee extends Manager {
	int y=20;
	int z=30;
	
	void m2() {
		System.out.println("B.m2");
		System.out.println("Value of A y=" + super.y);
		System.out.println("Value of A x=" + x);
		System.out.println("Value of z=" + z);
		System.out.println("Value of B y=" + y);
		System.out.println();
	}
	
	void m3() {
		System.out.println("Value of A x=" + x);
		System.out.println("B.m3");
	}
}
