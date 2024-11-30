// Inheritance Case:1 , Properties / Member will always Traverse /inherited from Parent Class to child class.(Static Polymorphism).

package imran.InheritancePrograms;

public class Test_Case1 {

	public static void main(String[] args) {
		
		Manager_1 M_1 = new Manager_1(); 
		System.out.println(M_1.a);
		System.out.println(M_1.b);
		//System.out.println(M_1.c); Unable to access variable c as it is not defined in parent class Manager_1.
		M_1.add();
		M_1.m2();
		//M_1.m3(); unable to access m3() as it is not defined in parent class Manager_1.
	}
}
