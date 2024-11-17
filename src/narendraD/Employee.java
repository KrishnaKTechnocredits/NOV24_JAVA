package narendraD;
class Employee{
	String employeeName = "Narendra Deshmukh";
	int employeeAge = 30;
	int employeeSalary = 50000;
	
	void printEmployeeDetails(){
		System.out.println("Employee name is:" + " " + employeeName);
		System.out.println("Employee age is: " + employeeAge);
		System.out.println("Employee salary is:" + " " + employeeSalary);
		
		System.out.println("Employee name is"+ " "+ employeeName + ", age is " +employeeAge + ", salary is " +employeeSalary);
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		Employee employee = new Employee();
		employee.printEmployeeDetails();
		System.out.println("End");
			
	}
}