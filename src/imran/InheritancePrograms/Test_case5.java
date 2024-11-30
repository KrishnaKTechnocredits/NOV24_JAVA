// Inheritance , Case: 5,  Dynamic Polymorphism. implicit conversion likewise of case3.

package imran.InheritancePrograms;

public class Test_case5 {
	
	public static void main(String[] args) {
		
		Manager_1 M_1 = new Manager_1();
		Employee_1 E_1 = new Employee_1();
		M_1 = E_1;// reference(M_1) of Parent Class is Assigned the Reference of Child class , it will point to Child Class Object , just like  "  Manager_1 M_1 = new Employee_1()". 
		System.out.println(M_1.a);
		System.out.println(M_1.b);
		//System.out.println(M_1.c);Unable to access variable c as it is not defined in parent class Manager_1.
		M_1.add();
		M_1.m2();
		//M_1.m3(); unable to access m3() as it is not defined in parent class Manager_1.
	}

}
