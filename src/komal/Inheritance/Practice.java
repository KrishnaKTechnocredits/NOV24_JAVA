package komal.Inheritance;

import komal.Basic.Assignment1;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj1 = new Child();
//	      Parent obj2 = (Parent) new Child();   
		obj1.PrintData();
//		obj2.PrintData();
		Assignment1 assignment1 = new Assignment1();
		assignment1.printData();
		assignment1.displayUsingImport();

	}

}

class Parent {

	String name = "komal";

	void PrintData() {
		System.out.println("method of parent class" + name);

	}
}

class Child extends Parent {
	String name = "vishal";
	String surname = "paygude";

	void PrintData() {
		System.out.println("method of child class......" + name + surname);
	}
}