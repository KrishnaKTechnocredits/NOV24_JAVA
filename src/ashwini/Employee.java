package ashwini;

class Employee{
	String empName = "Ashwini";
	int empAge = 25;
	int empSalary= 50000;
	
	void printEmpInfo(){
		System.out.println(empName);
		System.out.println(empAge);
		System.out.println(empSalary);
	}
 public static void main(String[] args){	
		Employee e = new Employee(); 
		e.printEmpInfo(); 

}
}

