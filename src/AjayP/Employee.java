package AjayP;

class Employee{
	
	String empName="Ajay";
	int empAge=28;
	int empSalary=35000;
	
	void printEmployeeDetails(){
		
		System.out.println("Employee Name is = " +empName);
		System.out.println("Employee Age is = " +empAge);
		System.out.println("Salary is = " +empSalary);
	}
	
	public static void main(String[] args){
		Employee employee=new Employee();
		employee.printEmployeeDetails();
	}
}