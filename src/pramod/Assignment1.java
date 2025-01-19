//Assignment1 
//Create a class called Empoyee having employee age, name , salary and print them.

package pramod;

class Assignment1{
	String empName = "Pramod";
	int empAge = 30;
	int empSalary = 100000;
	
	void printEmployeeDetails(){
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Age: " + empAge);
		System.out.println("Employee Salary: " + empSalary);
	}
	
	public static void main(String[] args){
		Assignment1 emp = new Assignment1();
		emp.printEmployeeDetails();
	}
}