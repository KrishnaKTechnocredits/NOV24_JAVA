package komal;

import komal.Basic.Assignment1;

public class Test extends Assignment1 {
	String name = "komal";
	int age = 27;
	int salary = 50000;

//	void printData() {
//		System.out.println("Name - " + name);
//		System.out.println("Age - " + age);
//		System.out.println("Salary - " + salary);
//	}

	public static void main(String[] args) {
		Test test = new Test();

		Assignment1 a = new Assignment1();
		test.printData();
		System.out.println(test.salary + "salary");
	}
}