package pankajP;

public class Employee {
	
	String name="Pankaj";
	int empAge=25;
	int empSalary=25000;
	
	void printEmployeeDetails()
	{
		System.out.println(name);
		System.out.println(empAge);
		System.out.println(empSalary);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hi");
		Employee employee=new Employee();
		employee.printEmployeeDetails();
		System.out.println(employee.empAge);
		
	}

}
