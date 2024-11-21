package komal;

public class Test {
	String name = "komal";
	int age = 27;
	int salary = 50000;
	
	void printData() {
		System.out.println("Name - "+name);
		System.out.println("Age - "+age);
		System.out.println("Salary - "+salary);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.printData();
	}
}