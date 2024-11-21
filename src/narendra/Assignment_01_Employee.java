package narendra;
/*
Assignment - 1 : 9th Nov'2024 (Day1)
Create a class called Employee having employee name , employee age, employee salary. and print them.
*/

class Assignment_01_Employee{
	String employeeName = "Narendra Deshmukh";
	int employeeAge = 30;
	int employeeSalary = 50000;
	
	void printEmployeeDetails1(){
		System.out.println("\n" + "Employee1 name is:" + " " + employeeName);
		System.out.println("Employee1 age is: " + employeeAge);
		System.out.println("Employee1 salary is:" + " " + employeeSalary);
	}
	
	void printEmployeeDetails2(){
		System.out.println("\n" +"Employee2 name is"+ " "+ employeeName + ", age is " +employeeAge + ", salary is " +employeeSalary);
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		Assignment_01_Employee employeedetails = new Assignment_01_Employee();
		employeedetails.printEmployeeDetails1();
		employeedetails.printEmployeeDetails2();
		System.out.println("\n" + "End");
			
	}
}