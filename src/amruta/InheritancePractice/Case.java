package amruta.InheritancePractice;

public class Case {

	public static void main(String[] args) {

		// -------------------- CASE 1 -------------------

		System.out.println("----------------- CASE 1 -----------------");

		Parent p = new Parent();

		System.out.println(p.x);
		System.out.println(p.y);
		// System.out.println(p.z);

		p.m1();
		p.m2();
		// p.m3();

		// -------------------- CASE 2 -------------------

		System.out.println("\n----------------- CASE 2 -----------------");

		Child c = new Child();

		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);

		c.m1();
		c.m2();
		c.m3();

		// -------------------- CASE 3 (Dynamic Polymorphism) -------------------

		System.out.println("\n----------------- CASE 3 -----------------");

		Parent p1 = new Child();

		System.out.println(p1.x);
		System.out.println(p1.y);
		// System.out.println(p1.z);

		p1.m1();
		p1.m2();
		// p1.m3();

		// -------------------- CASE 4 -------------------

		System.out.println("\n----------------- CASE 4 -----------------");

		// Child c1 = new Parent(); //Parents Object cannot assign to Child.

		System.out.println("Child c1 = new Parent();  //Parents Object cannot assign to Child.");

		// -------------------- CASE 5 -------------------

		System.out.println("\n----------------- CASE 5 -----------------");

		Parent p2 = new Parent();
		Child c2 = new Child();

		p2 = c2; // Again Dynamic Polymorphism

		System.out.println("Parent p2 = new Parent();");
		System.out.println("Child c2 = new Child();");
		System.out.println("p2 = c2; // Again Dynamic Polymorphism ");

		// -------------------- CASE 6 -------------------

		System.out.println("\n----------------- CASE 6 -----------------");

		Parent p3 = new Child();
		Child c3 = new Child();
		
		c3 = (Child)p3;   //Case 2
		
		System.out.println(c3.x);	
		System.out.println(c3.y);	
		System.out.println(c3.z);	
		
		c3.m1();	
		c3.m2();		
		c3.m3();		
	}
}
