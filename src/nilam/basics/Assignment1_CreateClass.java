package nilam.basics;

public class Assignment1_CreateClass {
	String empName="Nilam";
	int emp_Id=101;
	int empSal=70000;
		
	void printInfo(){
		System.out.println(empName);
		System.out.println(emp_Id);		
		System.out.println(empSal);
	}
			
	public static void main(String[] args){
		Assignment1_CreateClass assignment1_createclass= new Assignment1_CreateClass();
		assignment1_createclass.printInfo();
	}
}


