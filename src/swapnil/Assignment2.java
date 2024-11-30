package swapnil;

public class Assignment2 {
	String name = "EMP1";
	int age = 30;
	int salary = 50000;

	void printEmpDetails(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	public static void main(String[] args){
		Assignment2 assignment2 = new Assignment2();
		assignment2.printEmpDetails();
	}
}
