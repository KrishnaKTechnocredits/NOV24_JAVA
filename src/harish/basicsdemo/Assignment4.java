package harish.basicsdemo;

/**
 * Assignment - 4 : 13th Nov'2024 (25 mins)
 * 
 * Create a class called EmployeeDetails having following instance variable.
 * firstName, lastName, empId (int), managerId (int), address (String),
 * phoneNumber(String) ["+91-9765463742"]
 * 
 * create 5 methods. 1) updatePrimaryInfo() -> firstName, lastName, empId,
 * managerId 2) updateSecondaryInfo() -> address, phoneNumber 3)
 * displayPrimaryInfo() -> firstName, lastName, empId, managerId 4)
 * displayOtherInfo() -> address, phoneNumber 5) displayAllInfo() -> firstName,
 * lastName, empId, managerId, address, phoneNumber
 * 
 * main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo()
 * -> displayOtherInfo() -> displayAllInfo()
 */

public class Assignment4 {

	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;

	void updatePrimaryInfo() {
		firstName = "Harish";
		lastName = "Rahangdale";
		empId = 101;
		managerId = 999;
	}

	void updateSecondaryInfo() {
		address = "Pune, Maharashtra, India - 411061";
		phoneNumber = "+91-8237061139";
	}

	void displayPrimaryInfo() {
		System.out.println("Primary Info -");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee ID is: " + empId);
		System.out.println("Manager ID is: " + managerId);
		System.out.println("------------------------------- \n");
	}

	void displayOtherInfo() {
		System.out.println("Other Info -");
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		System.out.println("------------------------------- \n");
	}

	void displayAllInfo() {
		System.out.println("All Info -");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee ID is: " + empId);
		System.out.println("Manager ID is: " + managerId);
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		System.out.println("------------------------------- \n");
	}

	public static void main(String[] args) {
		Assignment4 assignment4 = new Assignment4();
		assignment4.updatePrimaryInfo();
		assignment4.updateSecondaryInfo();
		assignment4.displayPrimaryInfo();
		assignment4.displayOtherInfo();
		assignment4.displayAllInfo();
	}
}
