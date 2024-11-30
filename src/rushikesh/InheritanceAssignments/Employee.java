package rushikesh.InheritanceAssignments;

public class Employee extends Manager {

	String branchId = "EE001";
	String department = "IT-testing";
	String employeeDesignation = "Automation Testers";

	void employeePrimaryDetails() {
		System.out.println("Employee primary details in Employee class");
		String employeeName = "Rushikesh Kapare";
		int employeeId = 1010;
	}

	void employeeSecondaryDetails() {
		System.out.println("Employee secondary details in Employee class");
		String mbNumber = "+91-8308215351";
		String address = "Pune";
	}

	void employeeAllDetails() {
		System.out.println("Employee all details in Employee class");
		String employeeName = "Rushikesh Kapare";
		int employeeId = 1010;
		String mbNumber = "+91-8308215351";
		String address = "Pune";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// case 1: access property and behavior of only parent (Manger) class and show
		// static polymorphism
		Manager manger = new Manager();
		System.out.println("Case 1:");
		System.out.println(manger.branchId);
		System.out.println(manger.department);
		// System.out.println(manger.employeeDesignation); Compile Error
		manger.employeePrimaryDetails();
		manger.employeeAllDetails();
		// manger.employeeSecondaryDetails(); Compile Error
		System.out.println();

		// Case 2: access property and behavior of both parent and child class and show
		// dynamic polymorphism
		Employee employee = new Employee();
		System.out.println("Case 2:");
		System.out.println(employee.clientName); // from manager class
		System.out.println(employee.branchId); // from employee class -If same method and variables use in parent and
		System.out.println(employee.department); // from employee class child class then it will execute child class
													// methods and variables
		System.out.println(employee.employeeDesignation);
		employee.clientsDetails(); // from manager class
		employee.employeePrimaryDetails();
		employee.employeeSecondaryDetails();
		employee.employeeAllDetails();
		System.out.println();

		// case 3: access property and methods which are present in parent class
		Manager manager = new Employee(); // creating object of employee class and assign to manager class
											// which has refrence type of Manager class
		System.out.println("Case 3:");
		System.out.println(manager.branchId); // variable will remain same during compile time and run time.
		System.out.println(manager.clientName);
		System.out.println(manager.department);
		// System.out.println(manager.employeeDesignation); Compile Error due to during
		// compile it will check methods and variable are present in parent class or not
		manager.clientsDetails();
		manager.employeePrimaryDetails(); // here behavior will change from compile time to run time
		// manager.employeeSecondaryDetails(); Compile Error
		manager.employeeAllDetails();
		System.out.println();

		// case 4:
		Manager manager1 = new Manager();
		System.out.println("Case 4:");
		// Employee employee1=new Manager(); // Compile error due to we implicit wait of
		// parent class is greater than child class and here we try to create object of
		// parent class and assign to child

		// case 5: implicit type casting and Act as Dynamic polymorphism
		Manager manager2 = new Manager();
		Employee employee2 = new Employee();
		manager2 = employee2; // Implicit type casting - Manager manager2= new Employee();
		System.out.println("Case 5:");
		System.out.println(manager2.branchId);
		System.out.println(manager2.clientName);
		System.out.println(manager2.department);
		// System.out.println(manager2.employeeDesignation); Compile error -due to it
		// will act as a dynamic pollymorphism
		manager2.employeePrimaryDetails(); // behavior will change form compile time to run time
		manager2.employeeAllDetails(); //// behavior will change form compile time to run time
		manager2.clientsDetails();
		// manager2.employeeSecondaryDetails(); Compile error - method not present in
		// parent class
		System.out.println();

		// case 6: Explicit type casting and Act as static polymorphism
		Manager manager3 = new Employee();
		Employee employee3 = new Employee();
		employee3 = (Employee) manager3; // Explicit type casting - Employee employee3=new Employee();
		System.out.println("Case 6:");
		System.out.println(employee3.clientName);
		System.out.println(employee3.branchId);
		System.out.println(employee3.department);
		System.out.println(employee3.employeeDesignation);
		employee3.clientsDetails();
		employee3.employeePrimaryDetails();
		employee3.employeeSecondaryDetails();
		employee3.employeeAllDetails();
	}

}
