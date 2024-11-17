package SiddharthK;

class Employee{
	String employeeName = "Siddharth";
	int employeeAge = 27;
	int employeeSalary = 500000;
	
	void printInfo(){
		System.out.println(employeeName);
		System.out.println(employeeAge);
		System.out.println(employeeSalary);
	}
	
	public static void main (String[] args){
		Employee e = new Employee ();
		e.printInfo();
	}
}