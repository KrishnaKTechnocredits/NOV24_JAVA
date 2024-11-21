package amrutaK;

public class Assignment_1 {
	String name = "Amruta";
	int age = 27;
	int salary = 50000;
	
	void printData() {
		System.out.println("Name - "+name);
		System.out.println("Age - "+age);
		System.out.println("Salary - "+salary);
	}
	
	public static void main(String[] args) {
		Assignment_1 a1 = new Assignment_1();
		a1.printData();
	}
}
