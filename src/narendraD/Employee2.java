package narendraD;

class Employee2{
	String employeeName = "Narendra Deshmukh";
	int employeeAge = 30;
	int employeeSalary = 50000;
	
	void printEmployeeDetails(){
		System.out.println("Employee name is"+ " "+ employeeName + ", age is " +employeeAge + ", salary is " +employeeSalary);
	}
	
	void updateDetails(){
		employeeAge = 35;
		employeeSalary = 70000;
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		Employee2 employee2 = new Employee2();
		employee2.printEmployeeDetails();
		employee2.updateDetails();
		employee2.printEmployeeDetails();
		System.out.println("End");
			
	}
}