// Inheritance Case: 6 , Explitily casting of Child Class reference type of Child Class to Parent Class reference of Child Class

package imran.InheritancePrograms;

public class Test_Case6 {

	public static void main(String[] args) {
		Manager_1 M_1 = new Employee_1();
		Employee_1 E_1 = new Employee_1();
		//E_1= M_1;  Child class Reference type can be Assigned to parent Class Reference type of Child class Object. only by Type Casting done in next line.
		E_1 = (Employee_1)M_1;// Child Class refence will point to parent class reference of child class object with the help of Type Casting .
		System.out.println(E_1.a);// a is a property of Parent Class , accessed by Child Class reference.
		System.out.println(E_1.b);
		System.out.println(E_1.c);
		E_1.add();// add is a Method/ Behaviour of Parent Class , accessed by Child Class reference.
		E_1.m2();
		E_1.m3();		
	}
}
