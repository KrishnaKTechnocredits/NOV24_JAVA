package komal.Inheritance;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj1 = new Child();
//	      Parent obj2 = (Parent) new Child();   
		obj1.PrintData();
//		obj2.PrintData();

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
		System.out.println("method of child class" + name + surname);
	}
}