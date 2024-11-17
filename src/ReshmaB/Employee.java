package ReshmaB;

public class Employee {
	String name="John";
	int age=35;
	int salary=50000;
	
	void printInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public static void main(String[] args){
		Employee e=new Employee();
		e.printInfo();
		}
}
