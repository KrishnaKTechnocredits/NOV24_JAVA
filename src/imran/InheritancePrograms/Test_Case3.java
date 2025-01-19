// Inheritance Case: 3, Dynamic Polymorphism. Child Class Object  can be assigned to Parent class Reference , Behaviour of parent class will be changed during runtime if Same signature method arise in child Class. 

package imran.InheritancePrograms;

public class Test_Case3 {

	public static void main(String[] args) {
		Manager_1 M_1 = new Employee_1();
		System.out.println(M_1.a);
		System.out.println(M_1.b);
		//System.out.println(M_1.c); Unable to access variable c as it is not defined in parent class Manager_1.
		M_1.add();
		M_1.m2();// Method/behaviour M2()of Parent Class will be Called during Compile Time But Result Will be Displayed from m2() of Child class during runTime as object is created of Employee_1 (Child) class.
		//M_1.m3(); unable to access m3() as it is not defined in parent class Manager_1.
	}
}
