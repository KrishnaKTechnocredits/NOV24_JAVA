// Inheritance Case2: Properties of Parent class will traverse to Child Class. (Static Polymorphism).
package imran.InheritancePrograms;

public class Test_Case2 {

	public static void main(String[] args) {
		Employee_1 E_1= new Employee_1();
		System.out.println(E_1.a);// a is a property of Parent Class , accessed by Child Class reference.
		System.out.println(E_1.b);
		System.out.println(E_1.c);
		E_1.add();// add is a Method/ Behaviour of Parent Class , accessed by Child Class reference.
		E_1.m2();
		E_1.m3();	
	}
}
