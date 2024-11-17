
package MayurW;

class Employee{
	String empName ="Techno credit";
	int empAge = 33;
	int empSalary = 100000;
	
	void displayEmpInfo(){
		System.out.println("Employee name is = "+empName);
		System.out.println("Age of employee is = "+empAge);
		System.out.println("Salary of the employee is = "+empSalary);
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		System.out.println("Displaying employee info");
		emp.displayEmpInfo();		
	}
}