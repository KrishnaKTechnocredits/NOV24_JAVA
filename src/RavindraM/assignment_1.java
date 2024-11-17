package RavindraM;
class Employee{
	String empName="Ram";
	int empSalary=60000;
	int empAge=28;
	
	void employeeDetails(){
		System.out.println("name of employee "+empName);
		System.out.println("salary of employee "+empSalary);
		System.out.println("age of employee "+empAge);
	}
	
	public static void main(String []args){
		Employee employee=new Employee();
		employee.employeeDetails();
	}
	
}