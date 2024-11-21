package prajaktaS;

public class Employee {
	
	String empName="Prajakta";
	int empSalary=20000;
	int empAge=26;
	
	void printData(){
		System.out.println("Employee name is : " +empName);
		System.out.println("Employee age is : " +empAge);
		System.out.println("Employee salary is : " +empSalary);
	}
	public static void main(String [] args)	{
		Employee employee=new Employee();
		employee.printData();
	}

}
