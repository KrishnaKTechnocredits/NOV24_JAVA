package komal.Inheritance;

public class Employee extends Manager {
	String name;
	String salary;
	String rollno = "101";

	public void getDetails() {
		this.name = "komal";
		this.salary = "300000";
		System.out.println("Employee Name is " + name);
	}

	public static void main(String args[]) {
//case 2 : create object of child class 		
		Employee emp = new Employee();
		System.out.println("Start case 2 -----");
		emp.getDetails();
		System.out.println("roll number is :" + emp.rollno);
		System.out.println("roll number is :" + emp.department);
		emp.getDetails();
		System.out.println("End case 2 -----");
//Case 3  :create object of child and assign to parent reference 
		Manager manager = new Employee();
		System.out.println("Start case 3 -----");
		manager.getDetails();
		System.out.println("Department is-----" + manager.department);
//		System.out.println("roll number is-----" + manager.rollno);
		System.out.println("End case 3 -----");
// Note : in this case we cannot access roll no. because which is in child class and not in parent class

//case 4 :Compilation error we cannot assign parent to child refrence so we need to make type casting

//      Employee emp1 = new Manager(); - compilation error
		System.out.println("in case 4 ----- getting compilation errror");

//case 5 :	

		Manager manager1 = new Manager();
		Employee emp3 = new Employee();
		manager1 = emp3;
		System.out.println("Start case 5 -----" + manager1.department);
		manager1.getDetails();
		System.out.println("Department is :" + manager1.department);
//		System.out.println("roll number is :" + manager1.rollno);
//here roll no will not display because which is present in child and here we access from parent reference
		System.out.println("end case 5 -----" + manager1.department);
		// case 5.1
		// emp3 = manager1; //getting compilation error
		emp3 = (Employee) manager1; // so we make explicit type casting
		emp3.getDetails();
		System.out.println("Start case 5.1 -----");
		System.out.println("Department is :" + emp3.department);
		System.out.println("roll number is :" + emp3.rollno);
		System.out.println("End case 5.1 -----");

//case 6 :

		Manager manager2 = new Employee();
		Employee emp4 = new Employee();
		// emp4 = manager2 ; // get compilation error cannot convert manager to employee
		emp4 = (Employee) manager2;
		System.out.println("Start case 6 ----- Using Type Casting ");
		emp4.getDetails();
		System.out.println("Department is :" + emp4.department);
		System.out.println("roll number is :" + emp4.rollno);
		System.out.println("End case 6 -----  ");
	}

}
