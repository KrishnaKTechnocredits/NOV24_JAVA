package komal.Basic;

public class Assignment1 {
	String name = "komal";
	int age = 31;
	int salary = 50000;

	public void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}

	public void displayUsingImport() {
		System.out.println("practice import package");
	}

	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.printData();
	}
}
