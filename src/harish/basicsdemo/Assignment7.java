package harish.basicsdemo;

/**
 * Assignment - 7 : 16th November 2024 (parameter practice)
 * 
 * Create a class called EmployeeDetails having following instance variable.
 * firstName, lastName, empId (int), managerId (int), address (String),
 * phoneNumber(String) ["+91-9765463742"]
 *
 * Create 5 methods from which 2 methods are parameterized method (1,2). 
 * 
 * 1) updatePrimaryInfo() -> firstName, lastName, empId, managerId 
 * 2) updateSecondaryInfo() -> address, phoneNumber 
 * 3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
 * 4) displayOtherInfo() -> address, phoneNumber
 * 5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber
 * 
 * main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo()
 * -> displayOtherInfo() -> displayAll
 */

public class Assignment7 {
	String firstName, lastName, address, phoneNumber;
	int employeeId, managerId;
	
	void updatePrimaryInfo(String firstName, String lastName, int employeeId, int managerId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.managerId = managerId;
	}
	
	void updateSecondaryInfo(String address, String phoneNumber) {
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void displayPrimaryInfo(){
		System.out.println("Primary Info -");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee ID is: " + employeeId);
		System.out.println("Manager ID is: " + managerId);
		System.out.println("------------------------------- \n");
	}

	void displayOtherInfo(){
		System.out.println("Other Info -");
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		System.out.println("------------------------------- \n");
	}

	void displayAllInfo(){
		System.out.println("All Info -");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee ID is: " + employeeId);
		System.out.println("Manager ID is: " + managerId);
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		System.out.println("------------------------------- \n");
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.updatePrimaryInfo("Harish","Rahangdale",101,999);
		assignment7.updateSecondaryInfo("Pune, MH", "+91-8237061139");
		assignment7.displayPrimaryInfo();
		assignment7.displayOtherInfo();
		assignment7.displayAllInfo();
	}

}
