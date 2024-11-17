package MadhuraK;

public class Employee {
	String empName = "Sam";
	int empAge = 30;
	int empSalary = 50000;
	
	void printInfo(){
		System.out.println (empName);
		System.out.println (empAge);
		System.out.println (empSalary);
	}
	
	public static void main (String [] args){
		Employee e = new Employee();
		e.printInfo();
	}
}
