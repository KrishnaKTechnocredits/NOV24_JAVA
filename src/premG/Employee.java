package premG;

public class Employee {
	String name = "Prem Lata Gupta";
	int age = 25;
	int salary =25000;
		
	void printInfo(){		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
		
	public static void main(String[] args){
		Employee e =new Employee();
		e.printInfo();
	}

}
