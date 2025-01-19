package komal.Basic;

public class Assignment1 {
	protected String name = "komalgggg";
	int age = 31;
	protected int salary = 50000;

	protected void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.printData();
		System.out.println(assignment1.salary);
	}
}
