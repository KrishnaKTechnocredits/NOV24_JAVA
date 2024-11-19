package akash;

class Employee{
	String employeeName="xyz";
	int employeeAge=33;
	int employeeSalery=50000;
	
	void printEmployeeDetails(){
		System.out.println(employeeName);
		System.out.println(employeeAge);
		System.out.println(employeeSalery);
	}
		public static void main(String[] args){
			Employee e=new Employee();
			e.printEmployeeDetails();
	}
		
}	
	