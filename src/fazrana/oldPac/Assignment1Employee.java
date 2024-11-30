package fazrana.oldPac;

public class Assignment1Employee {
	String name= "Employee1";
	int age= 26;
	int salary= 25000;
//	String name1;
	
	void printEmployeeInfo(){
		int x= 15;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);	
		System.out.println("Employee name is "+ name + ", age is " +age+ ",Salary is "+salary+" "+ x );	
	}
	
	void updateValue(){
		//x= 20;
		age=35;
		salary= 20000;
	}
	
	public static void main(String[] args){
		Assignment1Employee e= new Assignment1Employee();
		e.printEmployeeInfo();
		e.updateValue();
		e.printEmployeeInfo();
		System.out.println("my name is "+ e.name);
	}
}
