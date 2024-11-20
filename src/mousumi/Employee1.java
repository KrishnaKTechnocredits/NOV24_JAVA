package mousumi;

public class Employee1 {

	String name = "Mousumi";
	int age = 27;
	int salary = 80000;
	
	void printData() {
		System.out.println("Name - "+name);
		System.out.println("Age - "+age);
		System.out.println("Salary - "+salary);
	}
	
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.printData();
	}
}