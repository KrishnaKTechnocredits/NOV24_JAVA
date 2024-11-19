package kishor;
//Assignment:-1
public class Employee {
	String employeeName = "Kishor";
	int age = 25;
	int salary = 5000;
	
	void printDetails(){
		System.out.println(employeeName);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.printDetails();
	}
}
	